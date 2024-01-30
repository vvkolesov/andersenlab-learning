package com.andersenlab.lecture1.homework1;

public class HomeWorkApp {

    public static void main(String[] args) {

        printThreeWords();
        checkSumSign(-5, -4);
        printColor(-101);
        compareNumbers(10, 10);
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple\n");
    }

    public static void checkSumSign(int a, int b) {

        if (a + b >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    public static void printColor(int value) {

        if (value <= 0) System.out.println("Красный");
        else if (value > 100) System.out.println("Зеленый");
        else System.out.println("Желтый");
    }

    public static void compareNumbers(int a, int b) {

        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }
}
