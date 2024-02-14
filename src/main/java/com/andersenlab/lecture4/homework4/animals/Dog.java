package com.andersenlab.lecture4.homework4.animals;

public class Dog extends Animal {

    private static int instanceCounter;

    public Dog(String name, int maxRunningDistance, int maxSwimmingDistance) {
        super(name, maxRunningDistance, maxSwimmingDistance);
        instanceCounter++;
    }

    public static int getInstanceCounter() {
        return instanceCounter;
    }
}
