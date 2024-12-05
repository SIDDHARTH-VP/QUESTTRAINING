package com.quest.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Employee employee1=new Employee(101,"Sid",20,"IT",5000,1);
        Employee employee2=new Employee(102,"Sam",21,"IT",5000,1);
        Employee employee3=new Employee(103,"Jam",22,"HR",3000,3);
        Employee employee4=new Employee(104,"Sam",23,"HR",4500,4);

        List<Employee> employeeslist=List.of(employee1,employee2,employee3,employee4);

//        List<Integer> salarylist=employeeslist
//                .stream()
//                .peek(e-> System.out.println(e))
//                .map(e1->e1.getSalary())
//                .toList();

        List<Employee> sortsalaries=employeeslist
                .stream()
                .sorted((e1,e2)->Integer.compare(e2.getSalary(),e1.getSalary()))
                .toList();
        for (Employee employee : sortsalaries) {
            System.out.println(employee);
        }

        System.out.println("\nFiltered by department (HR):");
        employeeslist.stream()
                .filter(e -> "HR".equals(e.getDepartment()))
                .forEach(System.out::println);

        System.out.println("\nNames of employees");
        List<String> employeesNames=employeeslist
                .stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(employeesNames);

        System.out.println("\nGrouping Emp by Dept");
        Map<String,List<Employee>> groupByDept=employeeslist
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(groupByDept);

        System.out.println("\nTotal Salary");
        int totalSal=employeeslist
                .stream()
                .mapToInt(Employee::getSalary)
                .sum();
        System.out.println(totalSal);

        System.out.println("\nPrint name in ucase");
        employeeslist.stream()
                .map(e->e.getName().toUpperCase())
                .forEach(System.out::println);

        System.out.println("\nmAX SAL");
        employeeslist.stream()
                .max(Comparator.comparingInt(Employee::getSalary))
                .ifPresent(System.out::println);

        System.out.println("\n Min Salary");
        employeeslist.stream()
                .min(Comparator.comparingInt(Employee::getSalary))
                .ifPresent(System.out::println);

        System.out.println("\n Min Experience");
        employeeslist.stream()
                .min(Comparator.comparingInt(Employee::getYearOfExperience))
                .ifPresent(System.out::println);

        System.out.println("\n Sort and Skip");
        employeeslist.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary))
                .skip(2)
                .forEach(System.out::println);



    }
}
