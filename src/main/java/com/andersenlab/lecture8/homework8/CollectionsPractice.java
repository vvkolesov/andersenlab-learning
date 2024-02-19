package com.andersenlab.lecture8.homework8;

import java.util.*;

public class CollectionsPractice {

    public static void main(String[] args) {

        String[] words = new String[] {
                "Hello",
                "Hi",
                "Good morning",
                "Good evening",
                "Good afternoon",
                "Morning",
                "What's up",
                "Salute",
                "Good morning",
                "Morning",
                "Hi"
        };

        System.out.println(countUniqueWordsWithCollections(words));
    }

    public static Map<String, Integer> countUniqueWordsWithCollections(String[] words) {

        Map<String, Integer> hashMap = new HashMap<>();
        for (String word : words) {
            if (hashMap.containsKey(word)) {
                hashMap.put(word, hashMap.get(word)+1);
            } else {
                hashMap.put(word, 1);
            }
        }
        return hashMap;
    }
}
