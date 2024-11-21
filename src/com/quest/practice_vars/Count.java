package com.quest.practice_vars;

import java.util.Arrays;

public class Count {
    public static void main(String[] args) {
        int[] a = {10, 20, 10, 10, 30, 20, 50, 40, 40, 30, 30, 10};

        Arrays.sort(a);
//10, 10, 10, 10, 20, 20, 30, 30, 30, 30, 40, 40, 50
        int count = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                count++;
            } else {
                if (count > 1) {
                    System.out.println(a[i - 1] + "-" + (count / 2));
                }
                count = 1;
            }
        }

        if (count > 1) {
            System.out.println(a[a.length - 1] + "-" + (count / 2));
        }
    }
}
