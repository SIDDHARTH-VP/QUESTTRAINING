package com.quest.oops.simple;

public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Person[name=" + name +
                ", age=" + age + "]";
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

}
