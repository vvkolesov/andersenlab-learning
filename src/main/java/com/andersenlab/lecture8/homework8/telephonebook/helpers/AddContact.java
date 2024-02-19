package com.andersenlab.lecture8.homework8.telephonebook.helpers;

import java.util.HashMap;
import java.util.Map;

import static com.andersenlab.lecture8.homework8.telephonebook.helpers.ConsoleReader.*;

public class AddContact {

    public static Map<Integer, String> addContact() {

        Map<Integer, String> phoneBook = new HashMap<>();
        phoneBook.put(readPhoneFromConsole(), readNameFromConsole());

        return phoneBook;
    }


}
