package com.quest.oops.school;

public class School {
private static final int MAX_STUDENTS=10;
private static final int MAX_TEACHERS=5;
    private String name;
    private Teacher[] teachers=new Teacher[10];
    private Student[] students=new Student[10];

private int studentCount=0;
private int teacherCount=0;

    public School(String name) {
        this.name = name;
    }


    public void addStudent(Student student) {
        if(studentCount<MAX_STUDENTS) {
            studentCount++;
            students[studentCount]=student;
        }else{
            System.out.println("max std");
        }
    }

    public void addTeacher(Teacher teacher) {
        if(teacherCount<MAX_TEACHERS) {
            teacherCount++;
            teachers[teacherCount]=teacher;
        }else{
            System.out.println("max tea");
        }
    }

    public void displaySchoolDetails(){
        System.out.println("Displaying stddetails");
        for(Person student : students){
            if(student!=null){
                System.out.println(student.toString());
            }
        }
    }

}
