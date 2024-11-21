package com.quest.oops.library;

public interface LibraryOperations {

    void addBook(Book book, Book[] libraryBooks, int bookCount);
    void addMember(Member member, Member[] members, int memberCount);
    void borrowBook(Book book);
    void returnBook(Book book);
}


