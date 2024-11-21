package com.quest.practice_vars;

public class StrStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello World");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.insert(0, "Hello World");
        System.out.println(sb);

        sb.deleteCharAt(0);
        System.out.println(sb);
    }
}
