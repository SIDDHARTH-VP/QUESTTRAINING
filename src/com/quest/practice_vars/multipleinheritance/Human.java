package com.quest.practice_vars.multipleinheritance;

public class Human implements Bad,Good{
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.prop());
        human.present();

    }
    @Override
    public String prop() {
        return "Happy Human";
    }

    @Override
    public void present() {
        System.out.println("Bad Human");
    }
}

