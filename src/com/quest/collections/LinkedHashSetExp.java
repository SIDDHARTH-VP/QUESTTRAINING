package com.quest.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExp {
    public static void main(String[] args) {
        LinkedHashSet<String> lh=new LinkedHashSet<>();
        lh.add("A");
        lh.add("B");
        lh.add("C");
//        for (String s : lh) {
//            System.out.println(s);
//        }
//        System.out.println(lh.contains("A"));
//        System.out.println(lh.size());
//        System.out.println(lh.isEmpty());

        LinkedHashSet<Integer> lh1=new LinkedHashSet<>();
        for(int i=10;i<=100;i++){
            lh1.add(i);
        }

        //now adding 1-10
        lh1.add(9);
        lh1.add(8);
        lh1.add(4);
        lh1.add(3);
        lh1.add(1);
        lh1.add(2);
        lh1.add(7);
        lh1.add(5);
        lh1.add(6);

        lh1.add(null);

//here insertion order is maintained
        for(Integer x:lh1){
            System.out.println(x);
        }
    }
}
