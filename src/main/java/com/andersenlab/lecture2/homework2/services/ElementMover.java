package com.andersenlab.lecture2.homework2.services;

import java.util.Arrays;

public class ElementMover {

    public static void elementMover(int[] array, int n) {

        if (array.length != 0) {
            System.out.println(Arrays.toString(array));

            if (n > 0) {
                for (int i = 1; i <= n; i++) {
                    int lastArrayElement = array[array.length - 1];
                    for (int j = array.length - 2; j >= 0; j--) {
                        array[j + 1] = array[j];
                    }
                    array[0] = lastArrayElement;
                }
            } else if (n < 0) {
                for (int i = 0; i >= n; i--) {
                    int firstArrayElement = array[0];
                    for (int j = 1; j < array.length; j++) {
                        array[j - 1] = array[j];
                    }
                    array[array.length - 1] = firstArrayElement;
                }
            } else {
                System.out.println("No changes");
            }

            System.out.println(Arrays.toString(array));
        }
    }
}
