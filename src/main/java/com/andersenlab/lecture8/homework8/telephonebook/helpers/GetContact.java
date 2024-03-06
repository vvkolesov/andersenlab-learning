package com.andersenlab.lecture8.homework8.telephonebook.helpers;

import java.util.List;
import java.util.Map;

public class GetContact {

    public static List<Integer> getContact(Map<Integer,String> telephoneBook, String surname) {

        //v1 via array
        for (Map.Entry<Integer, String> phone : telephoneBook.entrySet()) {
            if (phone.getValue().equals(surname)) {
                System.out.println(phone.getKey());
            }
        }

        //v2 via streams
        return telephoneBook
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(surname))
                .map(Map.Entry :: getKey)
                .toList();
    }
}
