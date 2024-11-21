package com.quest.interfaces;

public class Result implements InterfaceA, InterfaceB {
    @Override
    public void add() {
        System.out.println("interface A add");
    }

    @Override
    public void add1() {
        System.out.println("interface b add1");

    }

    @Override
    public void sub() {
        System.out.println("interface B sub");
    }

    public static void main(String[] args) {
        Result r = new Result();
        System.out.println("Sucess");
        r.add();
        r.add1();
        r.sub();
    }
}
