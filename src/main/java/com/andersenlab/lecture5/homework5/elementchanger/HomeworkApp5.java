package com.andersenlab.lecture5.homework5.elementchanger;

import java.util.Arrays;
import java.util.Random;

public class HomeworkApp5 {

    public static void main(String[] args) throws Exception {

        Random random = new Random();
        String[] cars = {"bmw", "toyota", "kia", "ford", "chevrolet", "audi", "alfa romeo", "fiat", "renault"};
        Integer[] numbers = {1,2,3,4,5};

        System.out.println(Arrays.toString(cars));
        System.out.println(Arrays.toString(
                elementChanger(cars, random.nextInt(cars.length), random.nextInt(cars.length))));

        System.out.println();

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(
                elementChanger(numbers, random.nextInt(numbers.length), random.nextInt(numbers.length))));
    }

    //Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
    public static <T> T[] elementChanger(T[] array, int firstElement, int secondElement) throws Exception {
        if (array.length > secondElement && secondElement >= 0 && firstElement >= 0) {
            T buffer = array[firstElement];

            array[firstElement] = array[secondElement];
            array[secondElement] = buffer;
            return array;
        } else {
            throw new Exception ("Incorrect parameters");
        }
    }
}
