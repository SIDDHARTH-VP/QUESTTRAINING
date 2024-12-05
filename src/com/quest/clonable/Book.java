package com.quest.clonable;

public class Book implements Cloneable {
    private String bookId;
    private String author;
    private String title;
    private boolean available;

    public Book(String bookId, String author, String title, boolean available) {
        this.bookId = bookId;
        this.author = author;
        this.title = title;
        this.available = available;

    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

//    public boolean isValid() {
//        if(this.getbookId != null && )
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book cloneBook = (Book) super.clone();
        cloneBook.setBookId(new String(this.getBookId()));
        cloneBook.setAuthor(new String(this.getAuthor()));
        cloneBook.setTitle(new String(this.getTitle()));
        cloneBook.setAvailable(this.isAvailable());
        return cloneBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", available=" + available +
                '}';
    }
}
