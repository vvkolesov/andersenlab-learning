package com.andersenlab.lecture6.homework6.customexceptions;

public class MyArrayDataException extends NumberFormatException{

     public MyArrayDataException(int i, int j) {
        super(String.format("The data in row [%d] and column [%d] is not correct", i+1, j+1));
    }
}
