package com.quest.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExp {
    public static void main(String[] args) {
        HashMap<Integer,String> h= new HashMap<>();
        h.put(1,"a");
        h.put(2,"b");
        h.put(3,"c");
        h.put(4,"d");
        h.put(5,"e");
        h.put(6,"f");
        System.out.println("values");
        for (String s:h.values()) {
            System.out.println(s);
        }
        System.out.println("keys");
        for(Integer i:h.keySet()) {
            System.out.println(i);
        }
        System.out.println("key&value");
        for(Map.Entry<Integer,String> e:h.entrySet()) {
            System.out.println(e.getKey()+" "+e.getValue());
        }

        System.out.println(h.get(1));
        System.out.println(h.remove(2));
        System.out.println(h.size());
        System.out.println(h.isEmpty());
        System.out.println(h.containsKey(1));
    }
}
