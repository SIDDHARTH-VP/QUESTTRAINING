package com.quest.oops;

public class RegularStudent extends Student {
    public RegularStudent() {
        super();
        System.out.println("creating Regular std");
    }

    @Override
    public void attendClass() {
        System.out.println("attending online class and offline class");
    }

    @Override
    public void submitAssignment() {
        System.out.println(" Regular student submit assignment");

    }
}
