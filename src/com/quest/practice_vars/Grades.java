package com.quest.practice_vars;

import java.util.Scanner;

public class Grades {
    static final double MAX_SCORE = 100;
    static final double NUMSUB = 3.0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = validateStudentCount(sc);
        String grade = null;
        double[] scores = new double[(int) NUMSUB];

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the name of the student " + i + ":");
            String name = sc.next();

            // Getting scores for each subject by calling the validateScore method
            scores[0] = validateScore(sc, "Math");
            scores[1] = validateScore(sc, "Science");
            scores[2] = validateScore(sc, "English");

            double sum = scores[0] + scores[1] + scores[2];
            double avg = sum / 3;
            System.out.println("Total Score:" + sum);
            System.out.println("Average Score:" + avg);

            if (avg >= 90) {
                grade = "A";
            } else if (avg >= 80 && avg < 90) {
                grade = "B";
            } else if (avg >= 70 && avg < 80) {
                grade = "C";
            } else if (avg >= 60 && avg < 70) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("Grade :" + grade);

            switch (grade) {
                case "A":
                    System.out.println("Excellent Performance");
                    break;
                case "B":
                    System.out.println("Good job, but you can aim higher!");
                    break;
                case "C":
                    System.out.println("You need to put in more effort!!");
                    break;
                case "D":
                    System.out.println("Your performance is below expectations. Consider seeking help.");
                    break;
                case "F":
                    System.out.println("Failure. You need significant improvement.");
                    break;
            }

            if (scores[0] < 60 || scores[1] < 60 || scores[2] < 60) {
                System.out.println("Warning: Needs improvement in individual subjects.");
            }
        }
    }

    //method for validating score
    public static double validateScore(Scanner sc, String subject) {
        double score = -1;
        boolean flag = false;

        while (!flag) {
            try {
                System.out.println("Enter the score of " + subject + " :");
                score = sc.nextDouble();
                if (score >= 0 && score <= MAX_SCORE) {
                    flag = true;
                } else {
                    System.out.println("Invalid score! Please re-enter.");
                }
            } catch (Exception e) {
                System.out.println("Enter a valid number");
                sc.next();
            }
        }
        return score;
    }

    public static int validateStudentCount(Scanner sc) {
        int count = -1;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.println("Enter the number of students:");
                count = sc.nextInt();
                if (count > 0) {
                    valid = true;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } catch (Exception e) {
                System.out.println("Enter a valid integer.");
                sc.next(); // Clear the invalid input
            }
        }
        return count;
    }
}
