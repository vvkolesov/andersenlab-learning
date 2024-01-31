package com.andersenlab.lecture2.homework2;

import java.util.Arrays;

import static com.andersenlab.lecture2.homework2.services.BooleanNumberVerification.booleanNumberVerification;
import static com.andersenlab.lecture2.homework2.services.ConvertArgumentsToArray.convertArgumentsToArray;
import static com.andersenlab.lecture2.homework2.services.DoubleNumbersLessThanSix.doubleNumbersLessThanSix;
import static com.andersenlab.lecture2.homework2.services.DrawXinMatrix.drawXinMatrix;
import static com.andersenlab.lecture2.homework2.services.ElementMover.elementMover;
import static com.andersenlab.lecture2.homework2.services.FillOutArray.fillOutArray;
import static com.andersenlab.lecture2.homework2.services.LeapYearVerification.leapYearVerification;
import static com.andersenlab.lecture2.homework2.services.NumberVerification.numberVerification;
import static com.andersenlab.lecture2.homework2.services.PrintStringNTimes.printStringNTimes;
import static com.andersenlab.lecture2.homework2.services.SumVerification.sumVerification;
import static com.andersenlab.lecture2.homework2.services.ArrayChanger.arrayChanger;

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
}
