package com.quest.practice_vars;

public class PracticeVars {
    final static int VOTAGE=18;
    public static void main(String[] args) {
        int age=22;
        double salary=22.5;
        char gender='M';
        String firstName="John";
        System.out.println("age="+age);
        System.out.println("salary="+salary);
        System.out.println("gender="+gender);

        age=20;

        System.out.println("age="+age);
        System.out.println("VOTAGE="+VOTAGE);
//        VOTAGE=22;
//        it  cant be changed bcoz votage id final
        practiceConversion();
        stringConcatination();
        stringMethods();
    }
    private static void practiceConversion(){
        int a=20;
        double b=20.5;
        double sum=a+b;
        int round= (int)b;
        System.out.println("round="+round);
        System.out.println("sum="+sum);
    }
    private static void stringConcatination(){
        String s1="John";
        String s2="boe";
        String s3=s1+ " "+s2;
        System.out.println(s3);
        int age=20;
        System.out.println("Name="+s3+" "+"age="+age);
    }
    private static void stringMethods(){
        String s1="John";
        String s2="boe";
        String s3=new String("hello world");
        String s4=new String("hello world");
        System.out.println(s3.length());
        System.out.println(s3.equalsIgnoreCase(s2));
        System.out.println(s3.equals(s2));
        System.out.println(s4==s3);

    }
}
