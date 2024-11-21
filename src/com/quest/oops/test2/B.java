package com.quest.oops.test2;

public class B {
    void add(int a, int b) {
        int sum = a + b;
        System.out.println("B Class Add: " + sum);
    }
    void add(){
        System.out.println("B Class Add no arrgument");
    }
    static void add(int a){
        System.out.println("B class  static add method"+a);
    }
}
