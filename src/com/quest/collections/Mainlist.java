package com.quest.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Mainlist {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();

        personArrayList.add(new Person("Sam",25,"M","DL"));
        personArrayList.add(new Person("Ram",25,"M","KL"));
        personArrayList.add(new Person("Ham",17,"M","TN"));
        personArrayList.add(new Person("Harry",17,"M","KA"));
        personArrayList.add(new Person("Arry",17,"F","GA"));

        for (Person person : personArrayList) {
            if(person.getAge()>18){
                System.out.println(person.getName());
            }
        }

        Iterator<Person> iterator = personArrayList.iterator();
        System.out.println("Age less than 18");
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if(person.getAge()<18){
                System.out.println(person.getName());
            }
        }
    }
}
