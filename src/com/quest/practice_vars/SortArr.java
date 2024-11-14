package com.quest.practice_vars;

import java.util.Arrays;

public class SortArr {

        public static int[][] sortArray(int[][] arr) {
            for (int i = 0; i < arr.length; i++) {
                Arrays.sort(arr[i]);
            }
            return arr;
        }

        public static void printArray(int[][] arr) {
            for (int[] row : arr) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            int[][] arr = {
                    {5, 2, 8, 4, 1},
                    {12, 7, 3, 9, 6},
                    {10, 14, 11, 13, 15}
            };

            int[][] sortedArray = sortArray(arr);
            System.out.println("Sorted 2D array:");
            printArray(sortedArray);
        }


}