package com.quest.practice_vars;

import java.util.Scanner;

public class FibinocciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        if(n<1){
            System.out.println("Invalid number");
            return;
        }
        int a=0;
        int b=1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
        }

    }
}
