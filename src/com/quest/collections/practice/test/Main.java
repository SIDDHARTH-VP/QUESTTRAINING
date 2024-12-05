package com.quest.collections.practice.test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student(5,"Abc");
        Student student2=new Student(2,"Bbc");
        Student student3=new Student(4,"Cde");
        Student student4=new Student(3,"Dde");
        Student student5=new Student(1,"Ede");

        Map<Student,String> sortedMap=new HashMap<Student,String>();
        sortedMap.put(student1,"A");
        sortedMap.put(student2,"C");
        sortedMap.put(student3,"D");
        sortedMap.put(student4,"E");
        sortedMap.put(student5,"B");

//        List<Map.Entry<Student,String>> list=new ArrayList<Map.Entry<Student,String>>();>

        for(Map.Entry<Student,String> entry:sortedMap.entrySet()){
            System.out.println(entry.getKey().getId()+" "+entry.getKey().getName()+":"+entry.getValue());
        }


    }
}
