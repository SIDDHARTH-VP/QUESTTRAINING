package com.quest.thread;

public class ThreadEasy {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadA());
        Thread t2 = new Thread(new ThreadB());
        Thread t3 = new Thread(new ThreadC());

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

    }
}
    class ThreadA implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(500);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello");
        }
    }

    class ThreadB implements Runnable {
        public void run() {
            try {
                Thread.sleep(500);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("World");
        }
    }

    class ThreadC implements Runnable {
        public void run() {
            try {
                Thread.sleep(500);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("!");
        }
    }



