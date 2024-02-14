package com.andersenlab.lecture2.homework2.services;

public class DrawXinMatrix {

    public static void drawXinMatrix(int i, int j) {

        int counter = 1;

        for (int a = 0; a < i; a++) {
            for (int b = 0; b < j; b++) {
                if ((a == b) || ((a == (counter - 1)) && (b == (i - counter)))) {
                    System.out.print("\\ ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
            counter++;
        }
    }
}
