package com.quest.practice_vars;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        String revstr="";
        if(str.length()<2){
            System.out.println("invalid string");
        }

//        StringBuilder sb=new StringBuilder(str);
//        StringBuilder reverse=sb.reverse();
//        String reversed=reverse.toString();


        else{
            for(int i=str.length()-1;i>=0;i--){
                revstr = revstr + str.charAt(i);
            }
            if(str.equals(revstr)){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not a palindrome");
            }
        }
    }
}
