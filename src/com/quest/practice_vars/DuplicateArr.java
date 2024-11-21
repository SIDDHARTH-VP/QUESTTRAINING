package com.quest.practice_vars;
import java.util.Arrays;

public class DuplicateArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 4, 3, 6, 6};
        Arrays.sort(arr);

        System.out.println("Elements occurring more than once:");

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.println(arr[i]);
                while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
            }
        }
    }
}

