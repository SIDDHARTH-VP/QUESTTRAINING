package com.quest.practice_vars;

public class Str1 {

    public static void check(StringBuilder s1, StringBuilder s2) {
        if(s1==s2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        if(s1.equals(s2)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Hello");
        StringBuilder s2 = new StringBuilder("Hello");

        s2.append("World");
        System.out.println(s2.replace(0,1,"H"));
        System.out.println(s2.delete(1,3));
        System.out.println(s2.insert(4,"Sid"));
        //check(s1,s2);
        String s3 = "hello";
        String s4 = "world";

    }
}
