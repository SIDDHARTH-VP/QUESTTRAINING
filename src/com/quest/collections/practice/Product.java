package com.quest.collections.practice;

import java.util.HashMap;
import java.util.Map;

public class Product {
    public static void main(String[] args) {
        Map<String, Integer> products = new HashMap<String, Integer>();
        products.put("Apple", 100);
        products.put("Banana", 200);
        products.put("Orange", 150);

        System.out.println("Added products: " + products);

        products.put("Banana", 120);
        System.out.println("Updating price of banana is "+products.get("Banana"));

        String highestPricedProduct=null;
        Integer highestPrice=0;

        for (Map.Entry<String, Integer> current : products.entrySet()) {
            if (current.getValue() > highestPrice) {
                highestPrice = current.getValue();
                highestPricedProduct = current.getKey();
            }
        }

        System.out.println("\nThe product with the highest price is: " + highestPricedProduct +" with " + highestPrice );

    }
}
