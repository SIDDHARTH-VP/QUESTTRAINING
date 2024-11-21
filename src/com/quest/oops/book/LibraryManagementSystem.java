package com.quest.oops.book;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryAbs library = new Library();
        Scanner scanner = new Scanner(System.in);

        initializeSampleData((Library) library);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Search Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Display Available Books");
            System.out.println("7. Display All Members");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ISBN: ");
                    scanner.nextLine();
                    String isbn = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Publication Year: ");
                    int year = scanner.nextInt();
                    library.addBook(new Book(isbn, title, author, year));
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    System.out.print("Enter Member ID: ");
                    scanner.nextLine();
                    String memberId = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Contact Info: ");
                    String contact = scanner.nextLine();
                    library.addMember(new LibraryMember(memberId, name, contact));
                    System.out.println("Member added successfully.");
                    break;
                case 3:
                    System.out.print("Enter isbn: ");
                    scanner.nextLine();
                    String query = scanner.nextLine();
                    library.searchBook(query);
                    break;
                case 4:
                    System.out.println("Enter Member ID:");
                    scanner.nextLine();
                    String memberIdToBorrow = scanner.nextLine().trim();
                    scanner.nextLine();
                    System.out.println("Enter ISBN of the book to borrow:");
                    String isbnToBorrow = scanner.nextLine().trim();
                    library.borrowBook(isbnToBorrow, memberIdToBorrow);
                    break;
                case 5:
                    System.out.print("Enter Member ID: ");
                    scanner.nextLine();
                    memberId = scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    isbn = scanner.nextLine();
                    if (library.returnBook(memberId, isbn)) {
                        System.out.println("Book returned successfully.");
                    } else {
                        System.out.println("Unable to return book.");
                    }
                    break;
                case 6:
                    library.displayAvailableBooks();
                    break;
                case 7:
                    library.displayAllMembers();
                    break;
                case 8:
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }

    private static void initializeSampleData(Library library) {
        // Adding sample books
        library.addBook(new Book("101", "The Alchemist", "Paulo Coelho", 1988));
        library.addBook(new Book("102", "1984", "Asdfg", 1949));
        library.addBook(new Book("103", "To Kill ", "Harshh", 1960));
        library.addBook(new Book("104", "The Great", "Fsukhb", 1925));
        library.addBook(new Book("105", "Pride", "Jadjnh", 1813));

        // Adding sample members
        library.addMember(new LibraryMember("M001", "John", "123456789"));
        library.addMember(new LibraryMember("M002", "Smith", "09876543"));
        library.addMember(new LibraryMember("M003", "Ram", "a23456789"));
        library.addMember(new LibraryMember("M004", "Abi", "12345678"));
        library.addMember(new LibraryMember("M005", "sam", "98765432"));

    }
}
