package com.quest.practice_vars;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter the number to be divided ");
        num = validation(sc);
        System.out.println("Enter the 1 num to divide");
        int num2 = validation(sc);
        System.out.println("Enter the 2 num to divide");
        int num3 = validation(sc);
        if (num % num2 == 0 && num % num3 == 0) {
            System.out.println("The " + num + " divisible by both");
        } else if (num % num2 == 0 && num % num3 != 0) {
            System.out.println("The " + num + " divisible by " + num2);
        } else if (num % num3 == 0 && num % num2 != 0) {
            System.out.println("The " + num + " divisible by " + num3);
        }
    }

    public static int validation(Scanner sc) {
        boolean flag = false;

        int a = 0;
        while (!flag) {
            a = 0;
//            if (sc.hasNextInt()) {
//                a = sc.nextInt();
//            } else {
//                System.out.println("Enter a valid number");
//                sc.nextLine();
//            }
//            return a;
            try {
                a = sc.nextInt();
                if (a > 0) {

                    flag = true;

                } else {
                    System.out.println("Please enter a positive integer");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a positive integer");
                sc.nextLine();
            }

        }
        return a;

    }
}
