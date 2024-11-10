package com.quest.practice_vars;

import java.util.Scanner;

public class Calculator {
    private double result;

    private Calculator() {
        this.result = 0;
    }

    private void addition(double a, double b) {
        result = a + b;
        System.out.println(result);
    }

    private void subtraction(double a, double b) {
        result = result - b;
        System.out.println(result);
    }

    private void multiplication(double a, double b) {
        result = result * b;
        System.out.println(result);
    }

    private void division(double a, double b) {
        result = result / b;
        System.out.println(result);
    }

    public void squareroot(double a) {
        result = result * result;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator!");
        System.out.println("Enter first number");
        double a =0.0;
        try {
             a = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Enter valid number");
            return;
        }
        Calculator cal = new Calculator();

        while (true) {
            System.out.println("Enter a valid choice");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Squareroot\n6. Reset result\n7. Exit");
            int choice = sc.nextInt();


            switch (choice) {
                case 1:

                    System.out.println("Enter second number");
                    double b = sc.nextInt();
                    cal.addition(a, b);
                    break;
                case 2:

                    System.out.println("Enter second number");
                    double c = sc.nextInt();

                    cal.subtraction(a, c);
                    break;
                case 3:

                    System.out.println("Enter second number");
                    double e = sc.nextInt();

                    cal.multiplication(a, e);
                    break;
                case 4:

                    System.out.println("Enter second number");
                    double g = sc.nextInt();
                    if (g == 0) {
                        System.out.println("Division by zero is not possible enter another number");
                    } else {

                        cal.division(a, g);
                    }
                    break;
                case 5:

                    if (a > 0) {
                        cal.squareroot(a);
                    } else {
                        System.out.println("Invalid input");
                    }
                    break;
                case 6:
                    cal.result = 0.0;
                    System.out.println("Result: " + cal.result);
                    break;
                case 7:
                    System.out.println("Exiting program");
                    return;
                    default:
                        System.out.println("Invalid choice");


            }


        }
    }
}
