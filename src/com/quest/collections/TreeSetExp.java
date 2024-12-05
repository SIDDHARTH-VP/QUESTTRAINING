package com.quest.collections;

import java.util.TreeSet;

public class TreeSetExp {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
//        ts.add(1);
//        ts.add(3);
//        ts.add(2);
//        ts.add(4);

//        for (Integer i : ts) {
//            System.out.println(i);
//        }
//        System.out.println(ts.first());
//        System.out.println(ts.last());
//
//        System.out.println(ts.headSet(2));
//        System.out.println(ts.tailSet(2));
//
//        System.out.println(ts.descendingSet());
//
//        System.out.println();


        for (int i = 10; i < 100; i++) {
            ts.add(i);
        }

        ts.add(9);
        ts.add(8);
        ts.add(4);
        ts.add(3);
        ts.add(1);
        ts.add(2);
        ts.add(7);
        ts.add(5);
        ts.add(6);
ts.add(null);//this will create null pointer exception
        //data is manipulated
        for (Integer i : ts) {
            System.out.println(i);
        }
    }
}
