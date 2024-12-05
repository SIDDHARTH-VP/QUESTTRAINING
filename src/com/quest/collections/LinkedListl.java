package com.quest.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListl {
    public static void main(String[] args) {
//        LinkedList<String> list = new LinkedList<>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add("D");
//
//
//        list.addFirst("F");
//        list.add(4, "E");
//        System.out.println(list.size());
       // list.clear();
      //  System.out.println(list.get(0));
//  for (String s : list) {
//            System.out.println(s);
//        }

        LinkedList<Person> personList = new LinkedList<>();

        personList.add(new Person("Sam",25,"M","DL"));
        personList.add(new Person("Ram",25,"M","KL"));
        personList.add(new Person("Ham",17,"M","TN"));
        personList.add(new Person("Harry",17,"M","KA"));
        personList.add(new Person("Arry",17,"F","GA"));

        personList.addFirst(new Person("Eve", 22, "Female","SL" ));
        personList.addLast(new Person("Jack", 25, "Male","DL"));

        System.out.println("First person: " + personList.getFirst());
        System.out.println("Last person: " + personList.getLast());


        System.out.println("Removed first person: " + personList.removeFirst());
        System.out.println("Removed last person: " + personList.removeLast());

        System.out.println("\nRemaining people in the list:");
        for (Person person : personList) {
            System.out.println(person);
        }

        personList.add(2, new Person("Eve", 22,  "Female","SL"));
        System.out.println("\nRemaining people in the list:");
        for (Person person : personList) {
            System.out.println(person.getName());
        }

        boolean containsCharlie = personList.contains(new Person("Harry",17,"M","KA"));
        System.out.println("\nContains Charlie? " + containsCharlie);

        System.out.println("\nSize of the LinkedList: " + personList.size());

//        Iterator<Person> iterator = personList.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

    }
}
