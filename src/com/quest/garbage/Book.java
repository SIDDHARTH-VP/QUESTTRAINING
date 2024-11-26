package com.quest.garbage;

public class Book {
    private String title;
    private String author;
    private double price;
    private int stock;

    public static final double DISCOUNT_PERCENTAGE = 10.0;

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void purchase(int quantity) throws OutOfStockException {
        if (quantity>stock){
//            System.out.println("Not enough stock");
            throw new OutOfStockException("Not enough stock");
        }
        else {
            stock -= quantity;
            System.out.println("Purchase successful");
        }
    }
    public void display() {
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPrice: " + price + "\nStock: " + stock);
    }
}
