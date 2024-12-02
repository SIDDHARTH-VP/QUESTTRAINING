package com.quest.collections.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmpSearch {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();

        // Add some employee data
        employeeMap.put(101, "Sid");
        employeeMap.put(102, "Jon");
        employeeMap.put(103, "Ram");
        employeeMap.put(104, "Sam");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the emp id  ");
        int empId = scanner.nextInt();
        String empName = employeeMap.get(empId);
        if (empName != null) {
            System.out.println("The employee name is " + empName);
        }else {
            System.out.println("Enter a valid Id");
        }

    }
}
