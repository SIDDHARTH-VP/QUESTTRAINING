package com.quest.collections.practice.test;

import java.util.Comparator;
import java.util.Map;

public class PersonComparator implements Comparator<Map.Entry<Person,String>> {


    @Override
    public int compare(Map.Entry<Person, String> o1, Map.Entry<Person, String> o2) {
        return o1.getValue().compareTo(o2.getValue());
    }
}
