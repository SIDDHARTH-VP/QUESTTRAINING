package com.quest.practice_vars;

public class Methods {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        String replaceString=s.replace("Hello","Hai");
        System.out.println(s);
        String s2="hello world";
        System.out.println(s.compareTo(s2));
        System.out.println(s.compareToIgnoreCase(s2));
        System.out.println(s.isEmpty());
        String s3="    hello world    ";
        System.out.println(s3.trim());
        System.out.println(s.indexOf('d'));
        char[] m1={'0','1','2','3','4','5','6','7','8','9'};
        System.out.println(m1);

//        System.out.println(s.getChars(1,4, m1,2));
//        System.out.println(m1);

        System.out.println(String.valueOf('A'));
    }
}
