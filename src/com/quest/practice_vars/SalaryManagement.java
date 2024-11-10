package com.quest.practice_vars;

import java.util.Scanner;

public class SalaryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;  // Initialize flag to false
        int numOfEmp = 0;

        while (!flag) {  // Change to while (!flag)
            try {
                System.out.println("Enter the number of employees:");
                numOfEmp = sc.nextInt();
                if (numOfEmp > 0) {
                    flag = true;  // Set to true when input is valid
                } else {
                    System.out.println("Enter a positive number.");
                }
            } catch (Exception e) {
                System.out.println("Enter a valid number.");
                sc.nextLine();  // Clear the scanner buffer
            }
        }

        sc.nextLine();  // Clear newline character after reading integer

        String[] names = new String[numOfEmp];
        double[] baseSalaries = new double[numOfEmp];
        double[][] monthlySalaries = new double[numOfEmp][12];
        double[] totalSalaries = new double[numOfEmp];
        double[] avgSalaries = new double[numOfEmp];

        for (int i = 0; i < numOfEmp; i++) {
            System.out.println("\nEnter the name of Employee " + (i + 1) + ":");
            names[i] = sc.nextLine();

            double baseSalary = 0;
            boolean baseSalaryValid = false;
            while (!baseSalaryValid) {
                try {
                    System.out.println("Enter the base salary of " + names[i] + ":");
                    baseSalary = sc.nextDouble();
                    if (baseSalary > 0 && baseSalary <= 1000000) {
                        baseSalaryValid = true;
                    } else {
                        System.out.println("Enter a positive base salary up to 1,000,000.");
                    }
                } catch (Exception e) {
                    System.out.println("Enter a valid number for base salary.");
                    sc.nextLine();
                }
            }
            baseSalaries[i] = baseSalary;
            sc.nextLine();

            double sumOfOne = 0;
            for (int j = 0; j < 12; j++) {

                monthlySalaries[i][j] = 0;
                boolean monthlySalaryValid = false;
                while (!monthlySalaryValid) {
                    try {
                        System.out.println("Enter salary for month " + (j + 1) + ":");
                        monthlySalaries[i][j] = sc.nextDouble();
                        if (monthlySalaries[i][j] > 0 && monthlySalaries[i][j] <= 1000000) {
                            monthlySalaryValid = true;
                        }
                        else {
                            System.out.println("Enter a positive base salary up to 1,000,000.");

                        }
                    } catch (Exception e) {
                        System.out.println("Enter a valid number for monthly salary.");
                        sc.nextLine();
                    }

                }

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
            System.out.println("\nEmployee Name: " + names[i]);
            System.out.println("Base Salary: " + baseSalaries[i]);
            System.out.println("Monthly Salary Breakdown:");

            for (int j = 0; j < 12; j++) {
                System.out.println("  Month " + (j + 1) + ": " + monthlySalaries[i][j]);
            }

            System.out.println("Total Salary for the Year: " + totalSalaries[i]);
            System.out.println("Average Monthly Salary: " + avgSalaries[i]);
            double bonus = baseSalaries[i] * 0.1;  // Assume 10% of base salary as bonus
            System.out.println("Bonus: " + bonus);

            totalAverageSalary += avgSalaries[i];
        }

        System.out.println("\nAverage Salary for All Employees: " + (totalAverageSalary / numOfEmp));
        System.out.println("Thank you for using the Employee Salary Management System.");
    }
}
