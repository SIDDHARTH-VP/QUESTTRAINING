package com.quest.oops.book;

public class LibraryMember {
    private String memberId;
    private String name;
    private String contactInfo;
    private String[] borrowedBooks;
    private int borrowedBooksCount;

    private static final int MAX_BORROWED_BOOKS = 10;

    public LibraryMember(String memberId, String name, String contactInfo) {
        this.memberId = memberId;
        this.name = name;
        this.contactInfo = contactInfo;
        this.borrowedBooks = new String[MAX_BORROWED_BOOKS];
        this.borrowedBooksCount = 0;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(String[] borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }

    public void setBorrowedBooksCount(int borrowedBooksCount) {
        this.borrowedBooksCount = borrowedBooksCount;
    }

    public boolean borrowBook(String isbn) {
        if (borrowedBooksCount < MAX_BORROWED_BOOKS) {
            borrowedBooks[borrowedBooksCount] = isbn;
            borrowedBooksCount++;
             return true;  //changes done
        }
return false;

    }

    // Return Book
    public boolean returnBook(String isbn) {
        for (int i = 0; i < borrowedBooksCount; i++) {
            if (borrowedBooks[i].equals(isbn)) {
                for (int j = i; j < borrowedBooksCount - 1; j++) {
                    borrowedBooks[j] = borrowedBooks[j + 1];
                }
                borrowedBooks[borrowedBooksCount - 1] = null;
                borrowedBooksCount--;
                return true;
            }
        }
        System.out.println("Book not found in borrowed list.");
        return false;
    }

    @Override
    public String toString() {
        StringBuilder borrowedList = new StringBuilder();
        for (int i = 0; i < borrowedBooksCount; i++) {
            borrowedList.append(borrowedBooks[i]).append(i < borrowedBooksCount - 1 ? ", " : "");
        }
        return String.format("Member ID: %s, Name: %s, Contact: %s, Borrowed Books: [%s]",
                memberId, name, contactInfo, borrowedList.toString());
    }

}
