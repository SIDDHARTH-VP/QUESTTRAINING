package com.quest.collections.test;

import java.util.*;

public class MainForPerson {
    public static void main(String[] args) {

        Person person1 = new Person("Anne", 25, "Female");
        Person person2 = new Person("Ram", 30, "Male");
        Person person3 = new Person("Sam", 35, "Male");
        Person person4 = new Person("Anu", 28, "Female");

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        people.sort(Comparator.naturalOrder());
        System.out.println("List of people sorted by age");
        for (Person p : people) {
            System.out.println(p);
        }

        //set
        Set<Person> people2 = new HashSet<>();
        people2.add(person1);
        people2.add(person2);
        people2.add(person3);
        people2.add(person4);
        people2.add(person1);
        System.out.println("\nSet of people:");
        for (Person p : people2) {
            System.out.println(p);
        }

        //Map
        Map<Integer, Person> personMap = new LinkedHashMap<>();
        personMap.put(1, person1);
        personMap.put(2, person2);
        personMap.put(3, person3);
        personMap.put(4, person4);
        System.out.println("\nMap of people:");
        for (Map.Entry<Integer, Person> entry : personMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        //Queue
        Queue<Person> peopleQueue = new PriorityQueue<>();
        peopleQueue.add(person1);
        peopleQueue.add(person2);
        peopleQueue.add(person3);
        peopleQueue.add(person4);

        System.out.println("\nQueue of people:");
        for (Person p : peopleQueue) {
            System.out.println(p);
        }



    }
}
