package com.quest.exception;

import java.io.IOException;

public class Library {
    int totalbooks;

    public Library(int totalbooks) {
        this.totalbooks = totalbooks;
    }

    public void borrowBook(int books) throws IOException {
        if(books < 1){
            throw new IOException("Books can't be less than 1");
        }
        if(books > totalbooks){
            throw new IOException("Books can't be greater than total books");
        }
        totalbooks-=books;
        System.out.println("Books borrowed: " + totalbooks);
    }
}
