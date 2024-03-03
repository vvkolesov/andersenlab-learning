package com.andersenlab.lecture8.homework8.telephonebook.helpers;

import java.util.HashMap;
import java.util.Map;



public class AddContact {

    public static Map<Integer, String> addContact() {

        Map<Integer, String> phoneBook = new HashMap<>();
        phoneBook.put(7654, "Sidorov");

        return phoneBook;
    }


}
