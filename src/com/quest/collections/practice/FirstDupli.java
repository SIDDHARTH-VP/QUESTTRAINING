package com.quest.collections.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FirstDupli {
    public static void main(String[] args) {
        Integer[] numbers = {1, 3, 4, 2, 5, 3, 6, 4};

        Set<Integer> seen = new HashSet<>();
        Integer firstDupli = null;

        for (Integer number : numbers) {
            if (seen.contains(number)) {
                firstDupli = number;
                break;
            }
            seen.add(number);
        }

        if (firstDupli != null) {
            System.out.println("First duplicate: " + firstDupli);
        } else {
            System.out.println("No duplicates found.");
        }
    }
}
