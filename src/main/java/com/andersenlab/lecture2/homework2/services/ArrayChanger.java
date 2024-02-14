package com.andersenlab.lecture2.homework2.services;

import java.util.Arrays;

public class ArrayChanger {

    public static void arrayChanger(int[] numbers) {

        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] == 0 ? numbers[i] = 1 : numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
    }
}
