package com.quest.oops.animal;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("cat eat fish");
    }

    @Override
    public void sound() {
        System.out.println("cat sound meow");
    }
}
