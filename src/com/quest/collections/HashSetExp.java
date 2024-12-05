package com.quest.collections;

import java.util.HashSet;

public class HashSetExp {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
//        h.add(1);
//        h.add(3);
//        h.add(2);
//        System.out.println(h.isEmpty());
//        System.out.println(h.size());
//        System.out.println(h.contains(1));
//        System.out.println(h.contains(3));
//        System.out.println(h.remove(3));
//        for(int i: h){
//            System.out.println(i);
//        }

        for(int i=10;i<=100;i++){
            h.add(i);
        }

        h.add(9);
        h.add(7);
        h.add(8);
        h.add(6);
        h.add(3);
        h.add(5);
        h.add(4);
        h.add(2);
        h.add(1);

        h.add(null);

//here insertion order is not maintained rather the data is manipulated and output is ordered
        for(Integer i:h){
            System.out.println(i);
        }
    }
}
