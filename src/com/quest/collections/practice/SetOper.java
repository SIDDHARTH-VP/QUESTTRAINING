package com.quest.collections.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOper {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        Set<Integer> union = new HashSet<>(set);
        union.addAll(set2);
        System.out.println("Union: " + union);

        Set<Integer> intersection = new HashSet<>(set);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        Set<Integer> difference = new HashSet<>(set);
        difference.removeAll(set2);
        System.out.println("Difference: " + difference);

        Set<Integer> difference2 = new HashSet<>(set2);
        difference2.retainAll(set);
        System.out.println("Difference2: " + difference2);

        //contains all elements
        if (set.containsAll(set2)) {
            System.out.println("set1 contains all elements of set2.");
        } else {
            System.out.println("set1 does not contain all elements of set2.");//here since both are not ame this will be prined
        }

        Iterator<Integer> iterator = set2.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if(element%3==0){
                iterator.remove();
            }
        }
        System.out.println("Modifed after removing div by 3: " + set2);
    }
}
