package com.quest.oops.library;

public class Book {
    private String title;
    private String author;
    private String isbn;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}





//Problem Statement:
//
//"Library Management System"
//
//You have been hired to develop a Library Management System that helps manage books and members. The system must have the following features:
//
//A Book class
//  *title,
//  *author,
//  *ISBN.
//  Books can be added to the system.



//A Member  (should implement Library Operations)
// name,
// ID
// membership type(premium and normal)
// . Members can borrow and return books.

//premium should have seperate class and inherit member class
//A feature where a Premium Member gets extra borrowing privileges, showcasing inheritance.


//An interface for LibraryOperations (This interface must be implemented by the Member entity.)
// that defines methods for borrowing
// method returning books.


//Overriding the toString method to return details about books and members in a readable format.


//A method to calculate late fees with a final parameter for the number of days late(Late Fee).

//The main program should demonstrate the system by:
//Adding books to the library.
//Adding members and allowing
// borrow and return books.
//Printing details of books and members.
//Calculating late fees