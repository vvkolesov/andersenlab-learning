package com.andersenlab.lecture8.homework8.telephonebook;

import java.util.*;

import static com.andersenlab.lecture8.homework8.telephonebook.helpers.AddContact.*;
import static com.andersenlab.lecture8.homework8.telephonebook.helpers.GetContact.*;


public class TelephoneBook {

    public static void main(String[] args) {

        Map<Integer, String> telephoneBook = new HashMap<>();
        telephoneBook.put(1234,"Ivanov");
        telephoneBook.put(5678,"Smirnov");
        telephoneBook.put(9012,"Sidorov");
        telephoneBook.put(3456,"Smith");
        telephoneBook.put(7890,"Smith");

        System.out.println(getContact(telephoneBook, "Sidorov"));
        telephoneBook.putAll(addContact());
        System.out.println(getContact(telephoneBook, "Sidorov"));
    }

}
