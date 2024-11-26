package com.quest.garbage;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book[] booksarray = {new Book("Happy","Sid",50.0,10),
                        new Book("Sad","Ram",50.0,8),
                        new Book("Good","Sam",80.0,5),
                        new Book("Bad","Hapd",85.0,3),
                        new Book("Moderate","Ron",25.0,2)};


        System.out.println("Bookstore Inventory:");
        for (Book book : booksarray) {
            book.display();
        }
       // double priceThreshold = 60.0;
        // Filter filter=(book,value)->getPrice()>priceThreshold;
        //


    }
}
