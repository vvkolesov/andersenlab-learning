package com.andersenlab.lecture2.homework2.services;

import java.util.Arrays;

public class ConvertArgumentsToArray {

    public static int[] convertArgumentsToArray(int len, int initialValue) {

        int[] convertedArray = new int[len];
        Arrays.fill(convertedArray, initialValue);
        return convertedArray;
    }
}
