package com.quest.practice_vars;

public class ArrayExp {
    public static void main(String[] args) {
        int [] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        for(int i:arr){
            System.out.println(i);
        }
        int [][] arr2=new int[10][10];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j]=j+1;
            }
        }
        for(int[] arreg:arr2){
            System.out.println("--");
            for(int j:arreg){
                System.out.print(j+" ");
            }
        }
    }
}
