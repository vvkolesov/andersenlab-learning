package com.andersenlab.lecture4.homework4.animals;

public class Cat extends Animal {

    private static int instanceCounter;

    public Cat(String name, int maxRunningDistance, int maxSwimmingDistance) {
        super(name, maxRunningDistance, maxSwimmingDistance);
        instanceCounter++;
    }

    public static int getInstanceCounter() {
        return instanceCounter;
    }
}
