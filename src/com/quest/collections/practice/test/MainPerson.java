package com.quest.collections.practice.test;

import java.util.*;

public class MainPerson {
    public static void main(String[] args) {
        Person person1=new Person(2);
        Person person2=new Person(4);
        Person person3=new Person(3);
        Person person4=new Person(5);
        Person person5=new Person(1);

        Map<Person,String> sortedmap=new HashMap<Person, String>();
        sortedmap.put(person1,"Abc");
        sortedmap.put(person2,"Bde");
        sortedmap.put(person3,"Cfg");
        sortedmap.put(person4,"Dhi");
        sortedmap.put(person5,"Ejk");

        List<Map.Entry<Person,String>> list=new ArrayList<>(sortedmap.entrySet());
        Collections.sort(list,new PersonComparator());

        for(Map.Entry<Person,String> entry:list){
            System.out.println(entry.getKey().getId()+" "+entry.getValue());
        }
    }
}
