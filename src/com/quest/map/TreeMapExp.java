package com.quest.map;

import java.util.TreeMap;

public class TreeMapExp {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("A", "B");
        map.put("C", "D");
        map.put("E", "F");
        map.put("G", "H");
        map.put("I", "J");

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        map.forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println("replaced: " + map.replace("A", "B","X"));

        TreeMap<Integer,String> map1 = new TreeMap<>();
        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"C");
        map1.put(4,"D");



        System.out.println(map1.firstKey());
        System.out.println(map1.lastKey());
        System.out.println(map1.firstEntry().getValue());
        System.out.println(map1.lastEntry().getValue());
        map1.forEach((k, v) -> System.out.println(k + " : " + v));
    }


}
