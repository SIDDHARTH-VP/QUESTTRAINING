package com.quest.oops.book;

import java.lang.reflect.Member;

public class Library extends LibraryAbs{
    private Book[] books;
    private LibraryMember[] members;
    private int bookCount;
    private int memberCount;

    private static final int MAX_BOOKS = 1000;
    private static final int MAX_MEMBERS = 100;

    public Library() {
        this.books = new Book[MAX_BOOKS];
        this.members = new LibraryMember[MAX_MEMBERS];
        this.bookCount = 0;
        this.memberCount = 0;
    }

    // Add a Book Done



    public void addBook(Book book) {
        if (bookCount < MAX_BOOKS) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added successfully. Total books: " + bookCount);
        } else {
            System.out.println("Library book storage is full.");
        }
    }


    // Add a Member Done
    @Override
    public void addMember(LibraryMember member) {
        if (memberCount < MAX_MEMBERS) {
            members[memberCount++] = member;
        } else {
            System.out.println("Library member storage is full.");
        }
    }



    // Search Book
    @Override
    public void searchBook(String query) {
        query = query.trim().toLowerCase();

        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().toLowerCase().equals(query)) {
                System.out.println(books[i]);
            return;
            }

        }
        System.out.println("Book is not available");

    }





        // Borrow Book
    @Override
        public void borrowBook(String isbn, String memberId) {
           Book book=findBook(isbn);
           LibraryMember member=findMember(memberId);
           if(book==null ) {
               System.out.println(" Book is not available");
               return;
           }
           if(member==null) {
               System.out.println("Member is not available");
           }
           if(book.checkAvailablity()){
               book.setAvailable(false);
               member.borrowBook(isbn);
               System.out.println("Book borrowed successfully. Total books: " + bookCount);
           }else {
               System.out.println("Book is not available");
           }
        }
    public Book findBook(String isbn){
        for (int i = 0; i < bookCount; i++) {
            if(books[i].getIsbn().equalsIgnoreCase(isbn)){
                return books[i];
            }
        }
        return null;
    }
    public LibraryMember findMember(String memberId) {
        for (int i = 0; i < bookCount; i++) {
            System.out.println("Checking member ID: " + members[i].getMemberId());
            if (members[i].getMemberId().equalsIgnoreCase(memberId)) {
                return members[i];
            }
        }
        return null;
    }




    // Return Book
    @Override
    public boolean returnBook(String memberId, String isbn) {
        LibraryMember member = findMemberById(memberId);
        Book book = findBookByIsbn(isbn);

        if (member != null && book != null) {
            book.setAvailable(true);
            return member.returnBook(isbn);
        }
        return false;
    }


    // Display Available Books
    @Override
    public void displayAvailableBooks() {
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i]; // Accessing book object
            if (book.isAvailable()) {
                System.out.println(book.toString()); // Display book details
            }
        }
    }

    // Display All Members
    @Override
    public void displayAllMembers() {
        for (int i = 0; i < memberCount; i++) {
            System.out.println(members[i]);
        }
    }


    private LibraryMember findMemberById(String memberId) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getMemberId().equalsIgnoreCase(memberId)) {
                return members[i];
            }
        }
        return null;
    }

    private Book findBookByIsbn(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equalsIgnoreCase(isbn)) {
                return books[i];
            }
        }
        return null;
    }
}






