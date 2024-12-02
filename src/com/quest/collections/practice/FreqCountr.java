package com.quest.collections.practice;

import java.util.HashMap;
import java.util.Map;

public class FreqCountr {
    public static void main(String[] args) {
        String input="Java is fun and java is powerful";

        input=input.toLowerCase();
        String[] words = input.split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if(wordCount.containsKey(word)){
                int currentCount = wordCount.get(word);
                wordCount.put(word, currentCount + 1);
            }else{
                wordCount.put(word, 1);
            }
        }

        System.out.println("Word frequencies:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
