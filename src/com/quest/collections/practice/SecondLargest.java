package com.quest.collections.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Collections.sort(numbers, Collections.reverseOrder());
        int largest = numbers.get(0);
        int secondLargest = 0;

        for (int num : numbers) {
            if (num < largest) {
                secondLargest = num;
                break;
            }
        }
        System.out.println("Second Largest: " + secondLargest);
    }
}
