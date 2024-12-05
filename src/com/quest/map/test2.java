package com.quest.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class test2 {
    public static void main(String[] args) {
//        HashMap<Boolean,Integer> h=new HashMap<>();
//        h.put(true,1);
//        h.put(false,2);
//        h.put(true,3);
//        h.put(false,4);
//        h.put(true,5);
//
//        LinkedHashMap<Boolean,Integer> l=new LinkedHashMap<>();
//        l.put(true,1);
//        l.put(false,2);
//        l.put(true,3);
//        l.put(false,4);
//        l.put(true,5);
//
//        TreeMap<Boolean,Integer> t=new TreeMap<>();
//        t.put(true,1);
//        t.put(false,2);
//        t.put(true,3);
//        t.put(false,4);
//        t.put(true,5);


        HashMap<Boolean, Double> hashMap = new HashMap<>();
        LinkedHashMap<Boolean, Double> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Boolean, Double> treeMap = new TreeMap<>();

        // Adding 5 data entries to each map
        hashMap.put(true, 10.5);
        hashMap.put(false, 20.3);
        hashMap.put(true, 15.2);
        hashMap.put(false, 30.4);
        hashMap.put(true, 25.5);

        linkedHashMap.put(true, 10.5);
        linkedHashMap.put(false, 20.3);
        linkedHashMap.put(true, 15.2);
        linkedHashMap.put(false, 30.4);
        linkedHashMap.put(true, 25.5);

        treeMap.put(true, 10.5);
        treeMap.put(false, 20.3);
        treeMap.put(true, 15.2); // Overwrites previous true value
        treeMap.put(false, 30.4); // Overwrites previous false value
        treeMap.put(true, 25.5);

        // Performing some methods
        System.out.println("HashMap: " + hashMap);
        System.out.println("HashMap contains key 'true': " + hashMap.containsKey(true));
        System.out.println("HashMap get 'false': " + hashMap.get(false));
        System.out.println("HashMap size: " + hashMap.size());
        hashMap.remove(false);
        System.out.println("HashMap after removing 'false': " + hashMap);

        System.out.println("\nLinkedHashMap: " + linkedHashMap);
        System.out.println("LinkedHashMap contains key 'false': " + linkedHashMap.containsKey(false));
        System.out.println("LinkedHashMap get 'true': " + linkedHashMap.get(true));
        System.out.println("LinkedHashMap size: " + linkedHashMap.size());
        linkedHashMap.clear();
        System.out.println("LinkedHashMap after clear: " + linkedHashMap);

        System.out.println("\nTreeMap: " + treeMap);
        System.out.println("TreeMap first key: " + treeMap.firstKey());
        System.out.println("TreeMap last key: " + treeMap.lastKey());
        System.out.println("TreeMap get 'false': " + treeMap.get(false));
        System.out.println("TreeMap size: " + treeMap.size());
        treeMap.replace(true, 50.0);
        System.out.println("TreeMap after replacing 'true' value: " + treeMap);

        //treemap red black tree
        //hashtable for other two

}
}
