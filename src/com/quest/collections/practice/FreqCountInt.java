package com.quest.collections.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FreqCountInt {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(4);
        numbers.add(4);

        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i : numbers){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else {
                map.put(i,1);
            }
        }
        System.out.println("Number of Freq Count: ");
        for(Integer i : map.keySet()){
            System.out.println(i+" "+map.get(i));
        }
    }
}
