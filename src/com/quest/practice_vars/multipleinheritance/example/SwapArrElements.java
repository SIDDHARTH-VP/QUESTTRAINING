package com.quest.practice_vars.multipleinheritance.example;

import java.util.Arrays;

public class SwapArrElements {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,6,7,8,9};

        //ar1[1]=1+5
        //ar2[1]=ar[1](6)-ar2[1]==6-5=1
        //ar1[1]=ar[1]-ar2[1]==6-1==5

        for(int i=0;i<arr1.length;i++){
//            int temp = arr1[i];
//            arr1[i]=arr2[i];
//            arr2[i]=temp;
            arr1[i]=arr1[i]+arr2[i];
            arr2[i]=arr1[i]-arr2[i];
            arr1[i]=arr1[i]-arr2[i];

        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}
