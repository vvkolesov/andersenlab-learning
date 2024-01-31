package com.andersenlab.lecture2.homework2.services;

public class LeapYearVerification {

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
}
