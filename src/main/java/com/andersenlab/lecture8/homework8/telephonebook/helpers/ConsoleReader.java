package com.andersenlab.lecture8.homework8.telephonebook.helpers;

import java.util.Scanner;

public class ConsoleReader {

    public static String readNameFromConsole() {

        Scanner scannerName = new Scanner(System.in);
        System.out.println("Please enter new contact's name");
        return scannerName.nextLine();
    }

    public static Integer readPhoneFromConsole() {

        Scanner scannerPhone = new Scanner(System.in);
        System.out.println("Please enter new contact's phone");
        return scannerPhone.nextInt();
    }
}
