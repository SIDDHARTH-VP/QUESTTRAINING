package com.quest.collections.practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MergeStrings {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        List<String> list2=new ArrayList<String>();
        list2.add("Lichi");
        list2.add("Banana");
        list2.add("Guva");

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        Set<String> mergedSet = new LinkedHashSet<>();
        mergedSet.addAll(list1);
        mergedSet.addAll(list2);
        System.out.println("Merged and duplicate  removed set: " + mergedSet);

    }
}
