package com.quest.oops.book;

import java.lang.reflect.Member;

public abstract class LibraryAbs {
    abstract void addBook(Book book);
    abstract void addMember(LibraryMember member);
    abstract void borrowBook(String isbn,String memberId);
    abstract boolean returnBook(String memberId, String isbn);
    abstract void displayAvailableBooks();
    abstract void displayAllMembers();
    abstract void searchBook(String search);

}
