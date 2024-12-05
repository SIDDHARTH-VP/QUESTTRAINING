package com.quest.practice_vars.multipleinheritance.example;

public class LongestSubString {
    public static void main(String[] args) {
        String a = "abbccc";
        int currentLength=1;
        int maxLength=0;
        char maxChar=' ';

        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == a.charAt(i - 1)) {
                currentLength++;
            }else{
                if (currentLength>maxLength){
                    maxLength=currentLength;
                    maxChar=a.charAt(i);
                }
                currentLength=1;
            }
        }
        if (currentLength>maxLength){
            maxLength=currentLength;
            maxChar=a.charAt(a.length()-1);
        }
        System.out.println("The longest occuring substring is '"+maxChar+"' with "+maxLength+" occurence");
    }
}
