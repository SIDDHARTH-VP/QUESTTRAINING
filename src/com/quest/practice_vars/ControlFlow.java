package com.quest.practice_vars;

public class ControlFlow {
    public static void main(String[] args) {
        int num = 10;
        if (num > 0) {
            System.out.println(num + "is positive");
        } else if (num < 0) {
            System.out.println(num + "is negative");
        } else {
            System.out.println(num + "is zero");
        }
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;
            case "Saturday":
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
testforLoop();
    }
    private static void testforLoop(){
        for (int i = 0; i < 21; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("even"+i);

        }
    }
    private static void TestforWhile(){
        int i=1;
        while(i<15){
            System.out.println(i);
            i++;

        }
    }

}
