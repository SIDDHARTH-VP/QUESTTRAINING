package com.quest.oops.school;

public class Teacher extends Person {


    private int id;
    private String[] subjects;
    public Teacher(String name, int age,int id, String[] subjects) {
        super(name, age);
        this.subjects = new String[2];
        this.id=id;
    }

    private int getId() {
        return id;
    }
    private String[] getSubjects() {
        return subjects;
    }
}
