package ru.gorshckov.animals;

import ru.gorshckov.interfacee.CanRun;

public class Cat extends Animal implements CanRun {
    private String ColorEye;

    public Cat(String name, int age, String colorEye) {
        super(name, age);
        ColorEye = colorEye;
    }

    public String getColorEye() {
        return ColorEye;
    }

    public void setColorEye(String colorEye) {
        ColorEye = colorEye;
    }

    @Override
    public void getName() {
        System.out.println("кличка кота(кошки) "+ name);
    }

    @Override
    public void run() {
        System.out.println("умеет бегать");
    }
}
