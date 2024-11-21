package com.quest.practice_vars;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3,},
                        {4, 5, 6},
                        {7, 8, 9}
        };
            for (int i = 0; i < arr.length; i++) {
                int left = 0;
                int right = arr[i].length - 1;
                while (left < right) {
                    int temp = arr[i][left];
                    arr[i][left] = arr[i][right];
                    arr[i][right] = temp;
                    left++;
                    right--;
                }
            }
//        System.out.println(Arrays.toString(arr));
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
        }
    }

