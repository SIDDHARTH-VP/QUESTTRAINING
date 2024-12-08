package com.quest.thread;

import java.util.Arrays;

public class Thread3Exp extends Thread {
    @Override
    public void run() {
        int[] odd =new int[10];
        int index=0;
        for(int i=1;i<=10;i++){
            if(i%2!=0){
                odd[index]=i;
            }
        }
        System.out.println("Odd number is "+ Arrays.toString(odd));
    }

}
