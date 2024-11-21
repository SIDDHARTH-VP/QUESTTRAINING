package com.quest.oops;

public class OfflineStd extends Student{
    public OfflineStd() {
        super();
        System.out.println("creating offline std");
    }
    @Override
    public void attendClass() {
        System.out.println("Attends offline class");
    }

    @Override
    public void submitAssignment() {
        System.out.println(" offline student Submit assignment");

    }
}
