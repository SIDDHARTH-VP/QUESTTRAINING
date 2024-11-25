package com.quest.exception;

public class StackOvrFlow {

        public static void causeStackOverflow() {
            causeStackOverflow();
        }

        public static void main(String[] args) {
            try {
                causeStackOverflow();
            } catch (StackOverflowError e) {
                System.err.println("StackOverflowError occurred!");
                e.printStackTrace();
            }
        }
    }


