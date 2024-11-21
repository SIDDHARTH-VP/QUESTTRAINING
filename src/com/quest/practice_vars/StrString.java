package com.quest.practice_vars;

public class StrString {
    public static void check(String s1, String s2) {
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
        String s1 = "abc";
        String s2 = "abc";
        check(s1,s2);
    }
}
