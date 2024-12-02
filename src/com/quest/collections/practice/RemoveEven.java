package com.quest.collections.practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveEven {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        System.out.println("Before removing even numbers: " + numbers);
        for(int i=numbers.size()-1;i>=0;i--) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }
        System.out.println("Even num removed list:"+numbers);
    }
}
