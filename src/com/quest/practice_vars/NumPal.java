package com.quest.practice_vars;

import java.util.Scanner;

public class NumPal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while (num > 0) {
           int rev = num % 10;
            sum = (sum * 10) + rev;
            num = num / 10;
        }
            if (temp == sum) {
                System.out.println(sum+ " is a Palindrome");
            } else {
                System.out.println(temp + " is not a Palindrome");
            }



    }
}
