package ru.gorshckov.animals;
import ru.gorshckov.interfacee.CanRun;
import ru.gorshckov.interfacee.CanSwim;

public class Tiger extends Animal implements CanRun, CanSwim {
    private String ColorWool; //цвет шерсти

    public Tiger(String name, int age, String colorWool) {
        super(name, age);
        ColorWool = colorWool;
    }

    @Override
    public void getName() {
        System.out.println("кличка тигра(тигрицы) "+ name);
    }

    @Override
    public void run() {
        System.out.println("умеет бегать");
    }

    @Override
    public void swim() {
        System.out.println("умеет плавать");
    }
}
