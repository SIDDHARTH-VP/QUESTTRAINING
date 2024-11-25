package com.quest.exception;

public class Employee {
    String name;
    int age;
    double salary;
    public Employee(String name, int age, double salary) throws ChekExcep {
        if(age<18){
            throw new ChekExcep("Age is less than 18.It should be more than 18");
        }
        if(salary<0){
            throw new ChekExcep("Salary is less than 0.It should be more than 0");
        }
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public  final void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
