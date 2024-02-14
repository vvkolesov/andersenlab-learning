package com.andersenlab.lecture4.homework4.animals;

public class Animal {

    private final String name;
    private final int maxRunningDistance;
    private final int maxSwimmingDistance;

    public Animal(String name, int maxRunningDistance, int maxSwimmingDistance) {
        this.name = name;
        this.maxRunningDistance = maxRunningDistance;
        this.maxSwimmingDistance = maxSwimmingDistance;
    }

    public void running(int distance) {
        String isFinish = distance > getMaxRunningDistance() ?
                getName() + " can run only " + getMaxRunningDistance() + " meters" :
                getName() + " run " + distance + " meters";
        System.out.println(isFinish);
    }

    public void swimming(int distance) {
        String isFinish = distance > getMaxSwimmingDistance() ?
                getName() + " can swim only " + getMaxSwimmingDistance() + " meters" :
                getName() + " swam " + distance + " meters";
        System.out.println(isFinish);
    }

    public String getName() {
        return name;
    }

    public int getMaxRunningDistance() {
        return maxRunningDistance;
    }

    public int getMaxSwimmingDistance() {
        return maxSwimmingDistance;
    }
}
