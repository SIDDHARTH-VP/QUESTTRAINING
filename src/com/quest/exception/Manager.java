package com.quest.exception;

public class Manager extends Employee{
    int teamSize;
    public Manager(String name, int age, double salary, int teamSize) throws ChekExcep {

        super(name, age, salary);
        if(teamSize < 0 || teamSize > 100){
            throw new IllegalArgumentException("Team size must be greater than1 or less than 100");
        }
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "teamSize=" + teamSize +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
