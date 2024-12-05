package com.quest.map;

import java.util.HashMap;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "one");
        treeMap.put(4, "four");
        treeMap.put(3, "three");
        treeMap.put(2, "two");

        treeMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
//key null value can be accepcted by tree map and no