package com.quest.oops.simple;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1);

        Student student = new Student("Bob", 20);
        System.out.println(student);

        student.displayDetails();
        student.updateCourse();


    }
}
