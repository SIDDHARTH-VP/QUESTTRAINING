package com.quest.practice_vars;

public class Str2 {

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
        StringBuilder s=new StringBuilder();
        StringBuilder s2=new StringBuilder("Hello");

        s.append("Hello World");
        System.out.println(s.toString());

        s.reverse();
        System.out.println(s.toString());

        s.insert(6,"Sid");
        System.out.println(s.toString());

        s.deleteCharAt(2);//r will be gone
        System.out.println(s.toString());

    }

}
