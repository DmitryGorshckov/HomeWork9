package ru.gorshckov.human;

import ru.gorshckov.interfacee.CanRun;
import ru.gorshckov.interfacee.CanSwim;

public abstract  class Human implements CanRun, CanSwim {
    protected String name;
    protected int age;
    protected int countLeg;

    public Human() {
    }

    public Human(String name, int age, int countLeg) {
        this.name = name;
        this.age = age;
        this.countLeg = countLeg;
    }

    @Override
    public void swim() {
        System.out.println("умеет плавать");
    }

    @Override
    public void run() {
        if (countLeg>0){
        System.out.println("умеет бегать");
    } else {
            System.out.println("не умеет бегать");
        }


}
}