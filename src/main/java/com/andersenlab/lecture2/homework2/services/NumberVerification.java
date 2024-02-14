package com.andersenlab.lecture2.homework2.services;

public class NumberVerification {
    public static void numberVerification(int a) {

        String answer = (a > -1) ? "the number is positive" : "the number is negative";
        System.out.println(answer);
    }
}
