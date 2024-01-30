package com.andersenlab.lecture2.homework2;

import java.util.Arrays;

public class HomeWorkApp {

    public static void main(String[] args) {

        //Task 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
        // в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        sumVerification(1,9);
        System.out.println("\n////////////////////////////////////////////////////////\n");

        //Task 2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
        // в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
        numberVerification(2);
        System.out.println("\n////////////////////////////////////////////////////////\n");

        //Task 3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
        // если число отрицательное, и вернуть false если положительное. Замечание: ноль считаем положительным числом.
        booleanNumberVerification(-2);
        System.out.println("\n////////////////////////////////////////////////////////\n");

        //Task 4. Написать метод, которому в качестве аргументов передается строка и число, метод должен
        // отпечатать в консоль указанную строку, указанное количество раз;
        printStringNTimes("this text will be printed 4 times", 4);
        System.out.println("\n////////////////////////////////////////////////////////\n");

        //Task * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
        // не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        leapYearVerification(100);
        System.out.println("\n////////////////////////////////////////////////////////\n");

        //Task 5. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        arrayChanger(arr);
        System.out.println("\n////////////////////////////////////////////////////////\n");

        //Task 6. Задать пустой целочисленный массив длиной 100.
        // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        int[] numbers = new int[100];
        fillOutArray(numbers);
        System.out.println("\n////////////////////////////////////////////////////////\n");

        //Task 7. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        // и числа меньшие 6 умножить на 2;
        int[] arrayForMultiplication = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        doubleNumbersLessThanSix(arrayForMultiplication);
        System.out.println("\n////////////////////////////////////////////////////////\n");

        //Task 8. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
        // если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
        // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        drawXinMatrix(5,5);
        System.out.println("\n////////////////////////////////////////////////////////\n");

        //Task 9.* Написать метод, принимающий на вход два аргумента: len и initialValue,
        // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
        int len = 6;
        int initialValue = 6;
        System.out.println(Arrays.toString(
                convertArgumentsToArray(len, initialValue))
        );
        System.out.println("\n////////////////////////////////////////////////////////\n");

        //Task *** Написать метод, которому на вход подается одномерный массив и
        // число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива
        // на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
        // при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
        int[] intArray = {1,2,3,4,5,6};
        int i = -2;
        elementMover(intArray, i);
    }

    public static void sumVerification(int a, int b) {

        System.out.println(a + b >= 10 && a + b <= 20);
    }

    public static void numberVerification(int a) {

        String answer = (a > -1) ? "the number is positive" : "the number is negative";
        System.out.println(answer);
    }

    public static void booleanNumberVerification(int a) { System.out.println(a > -1); }

    public static void printStringNTimes(String text, int a) {

        for (int i = 0; i < a; i++) {
            System.out.println(text);
        }
    }

    public static void leapYearVerification(int year) {

        if (year <= 0) {
            System.out.println(false);
        }
        else if ((year / 100) % 4 != 0) {
            System.out.println(false);
        }
        else {
            System.out.println((year % 4 == 0) || (year % 400 == 0));
        }
    }

    public static void arrayChanger(int[] numbers) {

        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] == 0 ? numbers[i] = 1 : numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
    }

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

    public static void doubleNumbersLessThanSix(int[] numbers) {

        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] < 6 ? numbers[i] *= 2 : numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
    }

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

    public static int[] convertArgumentsToArray(int len, int initialValue) {

        int[] convertedArray = new int[len];
        Arrays.fill(convertedArray, initialValue);
        return convertedArray;
    }

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
