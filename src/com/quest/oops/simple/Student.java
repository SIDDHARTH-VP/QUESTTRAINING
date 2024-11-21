package com.quest.oops.simple;

public class Student extends Person implements Feeling {
    private final String course="CSE";

    public Student(String name, int age) {
        super(name, age);
    }

    public void updateCourse() {
//         Course = "ECE";
        System.out.println("Course cannot be reassigned inside this method, final parameter value: " );
    }

    @Override
    public void feel() {
        System.out.println("Feeling happy");
    }
    @Override
    public void displayDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        String str=super.toString();
        str=str+"\nCourse: "+course;
        return str;
    }
}
