package com.quest.practice_vars.multipleinheritance.example;


public class StringImmutable {
    public static void main(String[] args) {
        String s = "Hello";
        //s.charAt(0)=h;//error hence immutable
        s=s+" World";
        System.out.println(s);
        StringBuilder builder = new StringBuilder("Hello");
        builder.append("World");
        System.out.println(builder);
        builder.setCharAt(0,'h');
        System.out.println(builder);
    }
}
