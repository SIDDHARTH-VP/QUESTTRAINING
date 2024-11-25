package com.quest.exception;

public class OutofMemErr {
    public static void causeOutOfMemory() {
        int[][] mem = new int[Integer.MAX_VALUE ][];
        int index = 0;

        while (true) {
            mem[index] = new int[1000000];
            index++;
        }
    }

    public static void main(String[] args) {
        try {
            causeOutOfMemory();
        } catch (Exception e) {
            System.out.println("out of memory");        }
    }
}
