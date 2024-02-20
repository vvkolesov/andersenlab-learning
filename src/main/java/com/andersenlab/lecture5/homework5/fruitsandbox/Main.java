package com.andersenlab.lecture5.homework5.fruitsandbox;


import com.andersenlab.lecture5.homework5.fruitsandbox.models.Box;
import com.andersenlab.lecture5.homework5.fruitsandbox.models.fruits.Apple;
import com.andersenlab.lecture5.homework5.fruitsandbox.models.fruits.Fruit;
import com.andersenlab.lecture5.homework5.fruitsandbox.models.fruits.Orange;


import java.util.ArrayList;

//import static com.andersenlab.lecture5.homework5.fruitsandbox.helpers.BoxManipulators.*;

public class Main {

    public static void main(String[] args) {



        Box<Apple> boxWithApples = new Box<>(new ArrayList<>());
        Box<Orange> boxWithOranges = new Box<>(new ArrayList<>());

        boxWithApples.putFruitToBox(new Apple());
        boxWithOranges.putFruitToBox(new Orange(), 4);

        System.out.println("Do boxes have the same weight: " + boxWithApples.boxWeightCompare(boxWithOranges));

        boxWithApples.putFruitToBox(new Apple(), 5);

        System.out.println("box with apples is weight: " + boxWithApples.getBoxWeight());
        System.out.println("box with oranges is weight: " + boxWithOranges.getBoxWeight());
        System.out.println("Do boxes have the same weight: " + boxWithApples.boxWeightCompare(boxWithOranges));

        Box<Apple> boxWithApples2 = new Box<>(new ArrayList<>());
        boxWithApples2.putFruitToBox(new Apple(), 4);
        boxWithApples.combineBoxes(boxWithOranges);
        boxWithApples.combineBoxes(boxWithApples2);
    }
}
