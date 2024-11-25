package com.quest.exception;

import java.io.IOException;

public class StLibrary extends Library {
    private int maxBooks;

    public StLibrary(int totalbooks,int maxbooks) {
        super(totalbooks);
        this.maxBooks = maxBooks;
    }
    @Override
    public void borrowBook(int books) throws IOException {
        if(books > maxBooks){
            throw new IOException("Books exceeds max number of books");
        }
        super.borrowBook(books);
    }

}
