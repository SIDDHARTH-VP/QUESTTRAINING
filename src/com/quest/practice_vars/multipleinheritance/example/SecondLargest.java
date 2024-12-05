package com.quest.practice_vars.multipleinheritance.example;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr={9,7,6,5,4,5,3,4,9,2};
        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        int SecondLargest = -1;
        for(int i= arr.length-2;i>=0;i--){
            if(arr[i]<largest){
                SecondLargest = arr[i];
                break;
            }
        }
        System.out.println("Second  largest "+SecondLargest);

    }
}
