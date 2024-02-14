package com.andersenlab.lecture4.homework4.catsAndPlates;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {

        Random random = new Random();

        Plate plate = new Plate(random.nextInt(51));
        Cat[] cats = new Cat[]{
                new Cat("Vasya", random.nextInt(50)),
                new Cat("Petya", random.nextInt(50)),
                new Cat("Lelya", random.nextInt(50)),
                new Cat("Slava", random.nextInt(50)),
                new Cat("Bolya", random.nextInt(50))
        };

        //● Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и
        // потом вывести информацию о сытости котов в консоль.
        // this is unlimited plate, all cats will be always full
        for (Cat cat : cats){
            plate.info();
            while (plate.getFoodQuantity() < cat.getAppetite()) {
                plate.putFoodToPlate(plate.getFoodQuantity(), cats.length);
            }

            plate.info();
            cat.eat(plate);

            System.out.println("- Is cat " + cat.getName() + " hungry? their appetite is " + cat.getAppetite()
                    + "\n- " + cat.isHungry() + "\n");
            plate.info();
        }

    }
}
