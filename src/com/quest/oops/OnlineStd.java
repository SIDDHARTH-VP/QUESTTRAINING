package com.quest.oops;

public class OnlineStd extends Student {
public OnlineStd() {
    super();
    System.out.println("creating online std");
}
    @Override
    public void attendClass() {
        System.out.println("Attends online class");

    }

    @Override
    public void submitAssignment() {
        System.out.println("online student Submit assignment");
    }
}
