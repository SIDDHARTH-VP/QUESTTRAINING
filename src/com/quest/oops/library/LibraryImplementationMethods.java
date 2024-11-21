package com.quest.oops.library;

import java.util.Scanner;

public class LibraryImplementationMethods {

    public static void addBookToLibrary(Member user, Book[] libraryBooks, int bookCount, Scanner scanner) {
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();

        Book newBook = new Book(title, author, isbn);
        user.addBook(newBook, libraryBooks, bookCount);
    }


    public static void addMemberToLibrary(Member[] members, int memberCount, Scanner scanner) {
        System.out.print("Enter Member Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Member ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Membership Type (Regular/Premium): ");
        String type = scanner.nextLine();

        // Separate Regular and Premium Member
        Member newMember;
        if (type.equalsIgnoreCase("Premium")) {
            newMember = new PremiumMember(name, id);
        } else {
            newMember = new Member(name, id, "Regular");
        }

        newMember.addMember(newMember, members, memberCount);
    }


    // Method  borrow a book
    public static void borrowBookFromLibrary(Member[] members, Book[] libraryBooks, Scanner scanner, int memberCount, int bookCount) {
        System.out.print("Enter Member ID: ");
        int memberId = scanner.nextInt();
        scanner.nextLine();
        Member borrower = findMemberById(members, memberId, memberCount);

        if (borrower != null) {
            System.out.print("Enter Book Title to Borrow: ");
            String bookTitle = scanner.nextLine();
            Book book = findBookByTitle(libraryBooks, bookTitle, bookCount); // Find book by title

            if (book != null) {
                borrower.borrowBook(book);
            } else {
                System.out.println("Book not found in the library.");
            }
        } else {
            System.out.println("Member not found.");
        }
    }

    // Method   return a book
    public static void returnBookToLibrary(Member[] members, Book[] books, Scanner scanner, int memberCount, int bookCount) {
        System.out.print("Enter Member ID: ");
        int memberId = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        Member member = findMemberById(members, memberId, memberCount);
        if (member != null) {
            System.out.print("Enter Book Title to Return: ");
            String bookTitle = scanner.nextLine();
            Book book = findBookByTitle(books, bookTitle, bookCount);
            if (book != null) {
                member.returnBook(book);
            } else {
                System.out.println("Book not found.");
            }
        } else {
            System.out.println("Member not found.");
        }
    }


    public static Member findMemberById(Member[] members, int id, int count) {
        for (int i = 0; i < count; i++) {
            if (members[i] != null && members[i].getMemberId() == id) {
                return members[i];
            }
        }
        return null;
    }

    public static Book findBookByTitle(Book[] books, String title, int count) {
        for (int i = 0; i < count; i++) {
            if (books[i] != null && books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    public static void displayAllMembers(Member[] members, int memberCount) {
        if (memberCount == 0) {
            System.out.println("No members in the library.");
        } else {
            System.out.println("\nMembers of the Library:");
            for (int i = 0; i < memberCount; i++) {
                if (members[i] != null) {
                    System.out.println(members[i]);
                }
            }
        }
    }

    public static void displayAllBooks(Book[] libraryBooks, int bookCount) {
        if (bookCount == 0) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("\nBooks in the Library:");
            for (int i = 0; i < bookCount; i++) {
                if (libraryBooks[i] != null) {
                    System.out.println(libraryBooks[i]);
                }
            }
        }
    }

    public static void calculateFine(Scanner scanner) {
        System.out.print("Enter the number of days late: ");
        int daysLate = scanner.nextInt();
        scanner.nextLine();
        final double dailyFine = 2.0;
        double totalFine = daysLate * dailyFine;
        System.out.println("The total fine for " + daysLate + " days late is: " + totalFine);
    }



}
