package com.quest.oops.school;

public class Student extends Person {
    private int rollNumber;
    private String[] subjects;

    public Student(String name, int age, int rollNumber, String[] subjects) {
        super(name, age);
        this.rollNumber = 0;
        this.subjects = new String[10];
    }
    @Override
    public String toString() {
        return "Student{"+
                "rollNumber"+rollNumber+
                "name"+getName()+
                "AGE"+getAge()+
                "subjects"+subjects.toString();
    }
}
