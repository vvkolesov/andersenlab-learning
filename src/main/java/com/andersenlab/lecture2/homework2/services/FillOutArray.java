package com.andersenlab.lecture2.homework2.services;

public class FillOutArray {

    public static void fillOutArray(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(
                numbers.length + "\n" +
                        numbers[0] + "\n" +
                        numbers[numbers.length - 1]
        );
    }
}
