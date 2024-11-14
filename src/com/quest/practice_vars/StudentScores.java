package com.quest.practice_vars;
public class StudentScores {
    public static void main(String[] args) {
        // Step 1: Initialize arrays
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace"};
        int[] ages = {20, 21, 22, 23, 24, 25, 26};
        int[][] scores = {
                {85, 90, 78, 92, -1},
                {88, 92, 80, -1, 85},
                {75, 80, 70, 60, 72},
                {90, 85, 88, 95, 92},
                {65, 70, 60, 68, 67},
                {80, 85, -1, 90, 95},
                {90, 88, 92, 85, 80}
        };

        // Step 2: Calculate average scores
        calculateAverageScores(names, ages, scores);

        // Step 3: Find the highest scorer
        findHighestScorer(names, ages, scores);

        // Step 4: Ranking students by average score
        rankStudents(names, ages, scores);

        // Step 5: Detect missing data
        detectMissingData(names, scores);
    }

    // Method to calculate and print average scores
    public static void calculateAverageScores(String[] names, int[] ages, int[][] scores) {
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            int count = 0;

            for (int score : scores[i]) {
                if (score != -1) {
                    sum += score;
                    count++;
                }
            }

            double average = count > 0 ? (double) sum / count : 0;
            System.out.printf("Name: %s, Age: %d, Average Score: %.2f%n", names[i], ages[i], average);
        }
    }

    // Method to find the student with the highest average score
    public static void findHighestScorer(String[] names, int[] ages, int[][] scores) {
        double highestAverage = 0;
        String topStudent = "";
        int topStudentAge = 0;

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            int count = 0;

            // Calculate the average score for each student, ignoring -1 values
            for (int score : scores[i]) {
                if (score != -1) {
                    sum += score;
                    count++;
                }

            }

            double average = count > 0 ? (double) sum / count : 0;

            if (average > highestAverage) {
                highestAverage = average;
                topStudent = names[i];
                topStudentAge = ages[i];
            }
        }

        System.out.printf("Highest Scorer: %s, Age: %d, Average Score: %.2f%n", topStudent, topStudentAge, highestAverage);
    }

    // Method to rank students based on average score
    public static void rankStudents(String[] names, int[] ages, int[][] scores) {
        int n = names.length;
        double[] averageScores = new double[n];

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int count = 0;

            for (int score : scores[i]) {
                if (score != -1) {
                    sum += score;
                    count++;

                }

            }

            averageScores[i] = count > 0 ? (double) sum / count : 0;
        }

         //Sort students
        for (int i = 0; i < n - 1; i++) {
            int tempstore= i;
            for (int j = i + 1; j < n; j++) {
                if (averageScores[j] > averageScores[tempstore]) {
                    tempstore = j;
                }
            }

            // Swap average scores
            double tempAvg = averageScores[i];
            averageScores[i] = averageScores[tempstore];
            averageScores[tempstore] = tempAvg;

            // Swap names
            String tempName = names[i];
            names[i] = names[tempstore];
            names[tempstore] = tempName;

            // Swap ages
            int tempAge = ages[i];
            ages[i] = ages[tempstore];
            ages[tempstore] = tempAge;
        }

        System.out.println("Rank\tName\t\tAge\tAverage Score");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%s\t%d\t%.2f%n", i + 1, names[i], ages[i], averageScores[i]);
        }
    }

    // Method to detect missing data in the scores array
    public static void detectMissingData(String[] names, int[][] scores) {
        System.out.println("Missing Data:");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(names[i] + ": ");
            boolean missingData = false;

            for (int j = 0; j < scores[i].length; j++) {
                if (scores[i][j] == -1) {
                    System.out.print("Subject " + (j + 1) + " ");
                    missingData = true;
                }
            }

            if (!missingData) {
                System.out.println("No missing data.");
            } else {
                System.out.println();
            }
        }
    }
}
