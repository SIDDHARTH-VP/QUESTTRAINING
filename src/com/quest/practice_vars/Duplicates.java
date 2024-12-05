package com.quest.practice_vars;
import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {

        int[] array = {4,8,9,1,4,4,8,7};
        int[] storingArray=new int[10];
        int count=0;
        for(int i=1;i<=10;i++){
            boolean flag=false;
            for (int currEle : array) {
                if (i == currEle) {
                    flag = true;
                    break;
                }
            }
            if(!flag){
                storingArray[count]=i;
                count++;
            }
        }
        storingArray=Arrays.copyOf(storingArray,count);
        System.out.println(Arrays.toString(storingArray));
}

}
