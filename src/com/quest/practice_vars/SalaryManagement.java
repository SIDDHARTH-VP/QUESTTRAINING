package com.quest.practice_vars;

import java.util.Scanner;

public class SalaryManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int numOfEmp = 0;

        // Validation for the number of employees
        while (!flag) {
            try {
                System.out.println("Enter the number of employees:");
                numOfEmp = sc.nextInt();
                if (numOfEmp > 0) {
                    flag = true;
                } else {
                    System.out.println("Enter a positive number.");
                }
            } catch (Exception e) {
                System.out.println("Enter a valid number.");
                sc.nextLine();
            }
        }

        sc.nextLine();

        // Variables
        String[] names = new String[numOfEmp];
        double[] baseSalaries = new double[numOfEmp];
        double[][] monthlySalaries = new double[numOfEmp][12];
        double[] totalSalaries = new double[numOfEmp];
        double[] avgSalaries = new double[numOfEmp];

        // Looping based on the number of employees
        for (int i = 0; i < numOfEmp; i++) {
            System.out.println("\nEnter the name of Employee " + (i + 1) + ":");
            names[i] = sc.nextLine();

            System.out.println("Enter the base salary of " + names[i] + ":");
            baseSalaries[i] = sc.nextDouble();
            sc.nextLine();

            double sumOfOne = 0;
            for (int j = 0; j < 12; j++) {
                System.out.println("Enter salary for month " + (j + 1) + ":");
                monthlySalaries[i][j] = sc.nextDouble();
                sumOfOne += monthlySalaries[i][j];
            }
            totalSalaries[i] = sumOfOne;
            avgSalaries[i] = sumOfOne / 12;
            sc.nextLine();
        }

        // Generate report
        System.out.println("\n--- Employee Salary Report ---");
        double totalAverageSalary = 0;

        for (int i = 0; i < numOfEmp; i++) {
            displayEmployeeReport(names[i], baseSalaries[i], monthlySalaries[i], totalSalaries[i], avgSalaries[i]);
            totalAverageSalary += avgSalaries[i];
        }

        System.out.println("\nAverage Salary for All Employees: " + (totalAverageSalary / numOfEmp));
        System.out.println("Thank you for using the Employee Salary Management System.");
    }

    // Method to calculate the bonus
    public static double calculateBonus(double baseSalary) {
        return baseSalary * 0.1; // Assume 10% of base salary as bonus
    }

    // Method to display employee report
    public static void displayEmployeeReport(String name, double baseSalary, double[] monthlySalaries, double totalSalary, double avgSalary) {
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Monthly Salary Breakdown:");

        for (int j = 0; j < monthlySalaries.length; j++) {
            System.out.println("  Month " + (j + 1) + ": " + monthlySalaries[j]);
        }

        System.out.println("Total Salary for the Year: " + totalSalary);
        System.out.println("Average Monthly Salary: " + avgSalary);
        System.out.println("Bonus: " + calculateBonus(baseSalary));
    }
}


