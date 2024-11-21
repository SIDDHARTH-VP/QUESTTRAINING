package com.quest.oops.animal;

public class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("Lion eat other animals");
    }

    @Override
    public void sound() {
        System.out.println("Lion Roars");

    }
}
