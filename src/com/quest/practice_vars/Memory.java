package com.quest.practice_vars;

public class Memory {
    public static void main(String[] args) {
        int l1=1;
        int l2=2;

        String s1="hello";
        String s2="hello";

        String s3= new String("hello");
        String s4=new String("world");

        check(l1,l2);
    }
    public static void check(int l1,int l2) {
        if(l1==l2) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
