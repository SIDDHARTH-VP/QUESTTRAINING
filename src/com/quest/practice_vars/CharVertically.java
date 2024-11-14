package com.quest.practice_vars;

public class CharVertically {
    public static void main(String[] args) {
        String str = "Hello World";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println("______________________________");
        System.out.println("Each char with count ");
        for (int i = 0; i < len; i++) {
            char currentChar = str.charAt(i);
            int count = 0;
            for (int j = 0; j < len; j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }
            System.out.println(currentChar + " - " + count);
        }
    }
}
