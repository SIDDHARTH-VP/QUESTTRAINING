package com.quest.practice_vars.multipleinheritance.example;

public class ArraySame {
    public static void main(String[] args) {
        int [] a={1,2,3,4};
        int [] b={1,2,3,4,5};
        int trueCount=0;

        if(a.length==b.length){
            for(int i=0;i<a.length;i++){
                if(a[i]==b[i]){
                    trueCount++;
                }
            }
        }
        if(trueCount==a.length){
            System.out.println("Array elements are same");
        }else{
            System.out.println("Array elements are different");
        }
    }
}
