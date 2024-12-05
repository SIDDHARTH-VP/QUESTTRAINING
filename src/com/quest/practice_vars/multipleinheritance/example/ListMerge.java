package com.quest.practice_vars.multipleinheritance.example;

import java.util.ArrayList;
import java.util.List;

public class ListMerge {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(4);
        list2.add(5);
        list2.add(6);

        list3.addAll(list1);
        list3.addAll(list2);

        System.out.println(list3);

    }
}
