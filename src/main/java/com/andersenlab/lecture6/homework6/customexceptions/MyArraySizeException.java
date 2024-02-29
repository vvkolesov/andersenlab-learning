package com.andersenlab.lecture6.homework6.customexceptions;

public class MyArraySizeException extends Exception{

    @Override
    public String getMessage() { return "The 2D array size is not 4x4"; }
}
