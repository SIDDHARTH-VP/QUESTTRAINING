package com.quest.interfaces;

public class Res extends Vehicle2 implements Vehicle{
    @Override
    public void engine() {
        System.out.println("I'm engine");
    }

    @Override
    void passenger() {

    }

    @Override
    public void wheels() {
        System.out.println("I'm wheels");

    }

    public static void main(String[] args) {
        Res res = new Res();
        
        res.engine();
        res.wheels();
    }
}
