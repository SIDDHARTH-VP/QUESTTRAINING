package com.quest.garbage;

public class Garbage {
    public static void main(String[] args) {
        Garbage g = new Garbage();
        Garbage g2 = new Garbage();

        g=null;
        System.gc();

        g2=null;
        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize"+this);
    }
}


//SAM-single abstract method(@functional interface)
// () -> {} Lamda method