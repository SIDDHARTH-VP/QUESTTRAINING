package com.quest.practice_vars;

public class MatrixExp {
    public static void main(String[] args) {
        int [][] arr=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=i+1;
            }
        }
        int value=3;
        String result = search(arr, value);
        if (!result.equals("-1")) {
            System.out.println(result);
        } else {
            System.out.println("Value not found.");
        }
    }
    public static String search(int[][] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == value) {
                    return "Found at index: (" + i + ", " + j + ")";
                }
            }
        }
        return "-1";
    }
}
