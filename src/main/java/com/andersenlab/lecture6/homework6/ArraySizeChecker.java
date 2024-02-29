package com.andersenlab.lecture6.homework6;

import com.andersenlab.lecture6.homework6.customexceptions.MyArrayDataException;
import com.andersenlab.lecture6.homework6.customexceptions.MyArraySizeException;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySizeChecker {

    public static void main(String[] args) {

        /*1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4.
        При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

        2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
        Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
        должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.

        3. В методе main() вызвать полученный метод, обработать возможные исключения
        MyArraySizeException и MyArrayDataException и вывести результат расчета.*/

        String[][] correctArray = new String[][] {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] incorrectSizeArray = new String[4][5];
        String[][] incorrectSizeArray2 = new String[][] {
                {"1", "2", "*", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "*", "4"},
                {"1", "2", "*", "4"}
        };

        try {
            System.out.println(arraySizeChecker(correctArray));
            System.out.println(arraySizeChecker(incorrectSizeArray2));
            System.out.println(arraySizeChecker(incorrectSizeArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }


    public static int arraySizeChecker(String[][] stringArray) throws MyArraySizeException, MyArrayDataException {

        if (stringArray.length != 4) { throw new MyArraySizeException();}
        int newValue = 0;

        for (int i = 0; i < stringArray.length; i++ ) {
            if (stringArray[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < stringArray[i].length; j++) {
                try {
                    newValue += Integer.parseInt(stringArray[i][j]);
                } catch (NumberFormatException e) {
                    // this is not a part of task, just total handling exception for fum (there was a question in the begging of lecture 6)
                    // by default it can be the next line 'throw new MyArrayDataException(i,j);'
                    System.out.println("There is a problem with array element. Would you like to continue? Y/N");
                    Scanner scanner = new Scanner(System.in);
                    String answer = scanner.nextLine();
                    if (answer.equalsIgnoreCase("Y")) {
                        while (i < 1) {
                            i++;}
                    } else throw new MyArrayDataException(i,j);
                }
            }
        }
        return newValue;
    }
}
