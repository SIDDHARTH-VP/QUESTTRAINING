package com.quest.exception;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws ChekExcep {
        valage(age);

        this.age = age;
    }

    public double getSalary()  {
        return salary;
    }

    public void setSalary(double salary) throws ChekExcep {
        valsal(salary);
        this.salary = salary;
    }

    public Employee(String name, int age, double salary) throws ChekExcep {
        validate(age, salary);
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    private static void validate(int age, double salary) throws ChekExcep {
        valage(age);
        valsal(salary);
    }

    private static void valage(int age) throws ChekExcep {
        if(age <18){
            throw new ChekExcep("Age is less than 18.It should be more than 18");
        }
    }

    private static void valsal(double salary) throws ChekExcep {
        if(salary <0){
            throw new ChekExcep("Salary is less than 0.It should be more than 0");
        }
    }

    public  final void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
