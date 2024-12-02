package com.quest.collections.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringDupli {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list);

        Set<String> set = new HashSet<String>(list);
        System.out.println("Removed Dupli"+set);
    }
}
