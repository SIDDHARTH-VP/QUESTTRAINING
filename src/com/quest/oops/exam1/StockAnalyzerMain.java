package com.quest.oops.exam1;

import java.util.Scanner;

public class StockAnalyzerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Equity stock
        System.out.println("Enter details for Equity Stock:");
        System.out.print("Stock Name: ");
        String equityName = scanner.nextLine();
        System.out.print("Stock Symbol: ");
        String equitySymbol = scanner.nextLine();
        System.out.print("Sector: ");
        String equitySector = scanner.nextLine();
        System.out.print("Number of days: ");
        int equityDays = validatePositiveInteger(scanner);
        int[] equityPrices = new int[equityDays];
        System.out.print("Enter prices: ");
        for (int i = 0; i < equityDays; i++) {
            equityPrices[i] = validatePositiveInteger(scanner);
        }

        EquityStockAnalyzer equityStock = new EquityStockAnalyzer(equityName, equitySymbol, equityPrices, equitySector);


        //commodity stock
        System.out.println("\nEnter details for Commodity Stock:");
        System.out.print("Commodity Type: ");
        String commodityType = scanner.nextLine();
        System.out.print("Stock Symbol: ");
        String commoditySymbol = scanner.nextLine();
        System.out.print("Number of days: ");
        int commodityDays = validatePositiveInteger(scanner);
        int[] commodityPrices = new int[commodityDays];
        System.out.print("Enter prices: ");
        for (int i = 0; i < commodityDays; i++) {
            commodityPrices[i] = validatePositiveInteger(scanner);
        }
        scanner.nextLine();
        CommodityStockAnalyzer commodityStock=new CommodityStockAnalyzer(commodityType, commoditySymbol, commodityPrices, commodityType);



        // Perform Analysis
        System.out.println("\nStock Analysis Results:");
        //for getting output of equityanalyzer class
        equityStock.displayAnalysis();

        System.out.println();
        //for getting output of commodityanalyzer class
        commodityStock.displayAnalysis();

        //comapring avg of equitystock and commodity stock
        System.out.println("\nComparison Results:");
        if (equityStock.calculateAveragePrice() > commodityStock.calculateAveragePrice()) {
            System.out.println("Stock with Highest Average Price: Equity Stock - " + equityName + " with Average Price: " + equityStock.calculateAveragePrice());
        } else if(equityStock.calculateAveragePrice() < commodityStock.calculateAveragePrice()) {
            System.out.println("Stock with Highest Average Price: Commodity Stock - Gold with Average Price: " + commodityStock.calculateAveragePrice());
        }

        //comaring the trend
        int[] equityTrend = equityStock.findLongestIncreasingTrend();
        int[] commodityTrend = commodityStock.findLongestIncreasingTrend();
        if (equityTrend[2] > commodityTrend[2]) { //int[] {startDay, endDay, length}
            System.out.println("Stock with Longest Increasing Trend: Equity Stock - " + equityName + " with a trend length of " + equityTrend[2] + " days.");
        } else if (equityTrend[2] < commodityTrend[2]) {
            System.out.println("Stock with Longest Increasing Trend: Commodity Stock - Gold with a trend length of " + commodityTrend[2] + " days.");
        } else {
            System.out.println("Both stocks have the same longest increasing trend length of " + equityTrend[2] + " days.");
        }


    }
    public static int validatePositiveInteger(Scanner scanner) {
        int value = 0;
        while (true) {
            try {
                value = Integer.parseInt(scanner.nextLine()); // Read input and convert to integer
                if (value > 0) {
                    return value; // Return valid input
                } else {
                    System.out.println("Error: Please enter a number greater than 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a valid integer.");
            }
        }
    }
}
