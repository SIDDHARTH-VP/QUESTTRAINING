package com.quest.oops.test3;

public class Person {
    private final String name="ABC";
    private void display() {
        System.out.println(name);
    }
    public void create(){
        display();
    }
    public class Person1{
        public static void main(String[] args) {
            Person p = new Person();
            String name1 = p.name; //here an error will be thrown
            p.create();
            p.display();
        }
    }

}
