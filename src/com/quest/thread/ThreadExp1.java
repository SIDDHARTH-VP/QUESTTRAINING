package com.quest.thread;

public class ThreadExp1 extends Thread {
    public static void main(String[] args) {
        ThreadExp1 t1 = new ThreadExp1();
        ThreadExp1 t2 = new ThreadExp1();
        ThreadExp1 t3 = new ThreadExp1();


        t1.setPriority(1);//t0
        t2.setPriority(7);//t1
        t3.setPriority(4);//t2

        t1.start();
        t2.start();
        t3.start();//start meth internally calls run()

    }

    public void run2(){
        System.out.println("Inside Run 2"+this.currentThread());
        System.out.println("Inside Run 2 current priority"+this.getPriority());

    }


    @Override
    public void run() {
        int a=10;
        int b=20;
        int c=a+b;

        this.run2();

        System.out.println("Thrtead started running..");
        System.out.println(c);
    }
}
