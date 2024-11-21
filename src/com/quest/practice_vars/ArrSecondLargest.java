package com.quest.practice_vars;

import java.util.Arrays;

public class ArrSecondLargest {
    public static void main(String[] args) {
        int []arr={8,5,6,4,9,6};
        Arrays.sort(arr);
        int n = arr.length;
        int largest=arr[n-1];
        int secondLargest=-1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                secondLargest = arr[i];
                break;
            }
        }

        if (secondLargest != -1) {
            System.out.println("Second largest element is: " + secondLargest);
        }
    }
}
