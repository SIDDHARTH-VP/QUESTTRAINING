package com.quest.collections.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CharCount {
    public static void main(String[] args) {
        String str = "hello world";

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        System.out.println("Character count: " + charCountMap);


        Map<String, Integer> map = Map.of(
                "Banana", 3,
                "Apple", 1,
                "Orange", 2,
                "Mango", 4
        );

        Map<String, Integer> sortedMap = new TreeMap<>(map);//tree map will auto sort
        System.out.println("SortedMap: " + sortedMap);

    }
}
