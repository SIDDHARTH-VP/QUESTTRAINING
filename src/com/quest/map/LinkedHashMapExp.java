package com.quest.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExp {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");

//        for(String s: map.values()){
//            System.out.println(s);
//        }
//        for(Integer i: map.keySet()){
//            System.out.println(i);
//        }
//        for(Map.Entry<Integer, String> entry: map.entrySet()){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
//
        map.forEach((k, v) -> System.out.println(k+" "+v));
    }
}
