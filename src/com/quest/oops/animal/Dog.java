package com.quest.oops.animal;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Eats Dog Food");
    }

    @Override
    public void sound() {
        System.out.println(" Dog Bark");
    }
}
