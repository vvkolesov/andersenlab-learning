package com.andersenlab.lecture2.homework2.services;

import java.util.Arrays;

public class DoubleNumbersLessThanSix {

    public static void doubleNumbersLessThanSix(int[] numbers) {

        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] < 6 ? numbers[i] *= 2 : numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
    }
}
