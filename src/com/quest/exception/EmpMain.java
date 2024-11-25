package com.quest.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = null;
        try {
            System.out.println("Enter the employee name: ");
            String name = sc.nextLine();
            System.out.println("Enter the employee age ");
            int age = sc.nextInt();
            System.out.println("Enter the employee salary ");
            double salary = sc.nextDouble();
            employee = new Employee(name, age, salary);

        } catch (ChekExcep e) {
            System.out.println("Error" + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch Error" + e.getMessage());
            sc.nextLine();
        }

        Manager manager=null;
        while (true) {
            try {
                System.out.println("Enter Manager Details:");
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.print("Age: ");
                int age = sc.nextInt();

                System.out.print("Salary: ");
                double salary = sc.nextDouble();

                System.out.print("Team Size: ");
                int teamSize = sc.nextInt();

                manager = new Manager(name, age, salary, teamSize);
                break;
            } catch (ChekExcep | IllegalArgumentException e ) {
                System.out.println("Error: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input type. Please enter correct values.");
                sc.nextLine();
            }
        }
        System.out.println("\n--- Employee Information ---");
        assert employee != null;
        employee.display();

        System.out.println("\n--- Manager Information ---");
        System.out.println(manager);
    }
}
