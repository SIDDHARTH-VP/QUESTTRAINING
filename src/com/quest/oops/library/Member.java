package com.quest.oops.library;

import java.util.Arrays;

public class Member implements LibraryOperations{
private String name;
private int memberId;
protected String membershiptype;
protected Book[] borrowedBooks;
protected int maxBooks;
private int currentBorrowedBooks;

public Member(String name, int memberId, String membershipType) {
    this.name = name;
    this.memberId = memberId;
    this.membershiptype = membershipType;
    this.maxBooks = 3;
    this.currentBorrowedBooks = 0;
    this.borrowedBooks = new Book[maxBooks];
}

    @Override
    public void addBook(Book book, Book[] libraryBooks, int bookCount) {
        if (bookCount < libraryBooks.length) {
            libraryBooks[bookCount] = book;
            System.out.println("Book added successfully: " + book);
        } else {
            System.out.println("Library is full! Cannot add more books.");
        }
    }

    @Override
    public void addMember(Member member, Member[] members, int memberCount) {
        if (memberCount < members.length) {
            members[memberCount] = member;
            System.out.println("Member added successfully: " + member);
        } else {
            System.out.println("Cannot add more members!");
        }
    }


    @Override
    public void borrowBook(Book book) {
        if(currentBorrowedBooks < maxBooks) {
            borrowedBooks[currentBorrowedBooks] = book;
            currentBorrowedBooks++;
            System.out.println("Borrowed"+book);
        }else{
            System.out.println("Can't borrowed");
        }
    }

    @Override
    public void returnBook(Book book) {
        boolean bookFound = false;
        for(int i=0;i<currentBorrowedBooks;i++){
            if (borrowedBooks[i] != null && borrowedBooks[i].getTitle().equals(book.getTitle())) {
                borrowedBooks[i] = null;
                currentBorrowedBooks--;
                bookFound = true;
                System.out.println("Returned"+book);
                break;
        }
    }
        if (!bookFound) {
            System.out.println("Can't return: Book not found in borrowed books.");
        }
    }

    public double calculateLateFee(final int daysLate) {
        return daysLate * 2.0;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", memberId=" + memberId +
                ", membershiptype='" + membershiptype + '\'' +
                ", borrowedBooks=" + Arrays.toString(borrowedBooks) +
                ", maxBooks=" + maxBooks +
                ", currentBorrowedBooks=" + currentBorrowedBooks +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getMembershipType() {
        return membershiptype;
    }

    public Book[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public int getCurrentBorrowedBooks() {
        return currentBorrowedBooks;
    }
}
