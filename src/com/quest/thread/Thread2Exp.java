package com.quest.thread;

import java.util.Arrays;

public class Thread2Exp extends Thread{
    public static void main(String[] args) {
        Thread2Exp t1 = new Thread2Exp();
        Thread3Exp t2 = new Thread3Exp();

        t1.start();
        t2.start();

    }

    @Override
    public void run() {
        int[] even=new int[10];
        int index=0;
        for(int i=1;i<=10;i++){
            if(i%2==0){
               even[index++]=i;
            }
        }
        System.out.println("Even num"+Arrays.toString(even));

    }
}
