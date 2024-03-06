package com.andersenlab.lecture8.homework8.telephonebook;

import java.util.*;

import static com.andersenlab.lecture8.homework8.telephonebook.helpers.AddContact.*;
import static com.andersenlab.lecture8.homework8.telephonebook.helpers.GetContact.*;


public class TelephoneBook {

    //
    //Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
    // В этот телефонный справочник с помощью метода add() можно добавлять записи,
    // а с помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть
    // несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
    //
    // Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
    // взаимодействие с пользователем через консоль и т.д).
    // Консоль использовать только для вывода результатов проверки телефонного справочника.

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
