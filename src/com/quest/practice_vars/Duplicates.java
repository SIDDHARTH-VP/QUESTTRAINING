package com.quest.practice_vars;
import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {

        int[] arr1 = {4,8,9,1,4};
        int[] arr2=new int[10];
        int count=0;
        for(int i=1;i<=10;i++){
            boolean flag=false;
            for (int k : arr1) {
                if (i == k) {
                    flag = true;
                    break;
                }
            }
            if(!flag){
                arr2[count]=i;
                count++;
            }
        }
        arr2=Arrays.copyOf(arr2,count);
        System.out.println(Arrays.toString(arr2));
}

}
