package com.andersenlab.lecture5.homework5.fruitsandbox.models;

import com.andersenlab.lecture5.homework5.fruitsandbox.models.fruits.Fruit;

import java.util.ArrayList;
import java.util.Objects;

public class Box<T extends Fruit> {

    ArrayList<T> fruits;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public void putFruitToBox(T fruit) {
        this.fruits.add(fruit);
    }

    public void putFruitToBox(T fruit, int fruitQuantity) {

        int i = 0;
        while (i < fruitQuantity) {
            this.fruits.add(fruit);
            i++;
        }
    }

    public float getBoxWeight() {

        if (!this.fruits.isEmpty()) {
            return this.fruits.size() * fruits.get(0).getFruitWeight();
        } return 0;
    }

    public boolean boxWeightCompare(Box box) {
        return this.getBoxWeight() == box.getBoxWeight();
    }

    public void combineBoxes(Box box) {

        if (this.equals(box)) {
            this.fruits.addAll(box.fruits);
            System.out.println("New box size " + box.getBoxWeight());
        }else System.out.println("Fruits can be combined only with the same fruits");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return Objects.equals(fruits.get(0).getClass(), box.fruits.get(0).getClass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(fruits);
    }
}
