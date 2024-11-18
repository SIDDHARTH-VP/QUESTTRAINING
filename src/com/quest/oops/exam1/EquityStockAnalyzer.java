package com.quest.oops.exam1;

public class EquityStockAnalyzer extends StockAnalyzer{
    String sector;
    public EquityStockAnalyzer(String stockName, String stockSymbol, int[] prices, String sector) {
        super(stockName, stockSymbol, prices);
        this.sector = sector;
    }

    @Override
    public int findMaxPrice() {
        int max = prices[0];
        for (int price : prices) {
            if (price > max) max = price;
        }
        return max;
    }

    @Override
    public int findMinPrice() {
        int min = prices[0];
        for (int price : prices) {
            if (price < min) min = price;
        }
        return min;
    }

    @Override
    public double calculateAveragePrice() {
        int sum = 0;
        for (int price : prices) {
            sum += price;
        }
        return (double) sum / prices.length;
    }

    @Override
    public int[] findLongestIncreasingTrend() {
        int maxLength = 1;
        int length = 1;
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) { //check if current price is greater than previous if yes len++
                length++;
                if (length > maxLength) {
                    maxLength = length;//updating maxlen of trend
                    start = tempStart;//updating the start
                    end = i;//updating the end
                }
            } else {
                length = 1;
                tempStart = i;
            }
        }
        return new int[]{start + 1, end + 1, maxLength};
    }

    @Override
    public void displayAnalysis() {
        System.out.println("Analysis for Equity Stock:");
        System.out.println("Stock Name: " + stockName);
        System.out.println("Stock Symbol: " + stockSymbol);
        System.out.println("Sector: " + sector);
        System.out.println("Highest Price: " + findMaxPrice());
        System.out.println("Lowest Price: " + findMinPrice());
        System.out.println("Average Price: " + calculateAveragePrice());
        int[] trend = findLongestIncreasingTrend();
        System.out.println("Longest Increasing Trend: Start Day " + trend[0] + ", End Day " + trend[1] + ", Length: " + trend[2] + " days");

    }
}
