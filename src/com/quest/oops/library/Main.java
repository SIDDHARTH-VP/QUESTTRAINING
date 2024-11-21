package com.quest.oops.library;

import java.util.Scanner;

import static com.quest.oops.library.LibraryImplementationMethods.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Book[] libraryBooks = new Book[10];
        LibraryOperations[] members = new Member[10];
        int bookCount = 0;
        int memberCount = 0;

        // Adding sample books
        libraryBooks[bookCount++] = new Book("The Alchemist", "Paulo Coelho", "B001");
        libraryBooks[bookCount++] = new Book("To Kill ", "Hamish", "B002");
        libraryBooks[bookCount++] = new Book("1984", "George ", "B003");

        // Adding sample members
        members[memberCount++] = new Member("Ram", 101, "Regular");
        members[memberCount++] = new PremiumMember("Bob", 102);


        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display All Books");
            System.out.println("6. Display All Members");
            System.out.println("7. Calculate fine");
            System.out.println("8. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            Member user = new Member("John Doe", 1, "Regular");

            switch (choice) {
                case 1:
                    addBookToLibrary(user,libraryBooks, bookCount, scanner);
                    bookCount++;
                    break;

                case 2:
                    addMemberToLibrary((Member[]) members, memberCount, scanner);
                    memberCount++;
                    break;

                case 3:
                    borrowBookFromLibrary((Member[]) members, libraryBooks, scanner, memberCount, bookCount);
                    break;

                case 4:
                    returnBookToLibrary((Member[]) members, libraryBooks, scanner, memberCount,bookCount);
                    break;

                case 5:
                    displayAllBooks(libraryBooks, bookCount);
                    break;

                case 6:
                    displayAllMembers((Member[]) members, memberCount);
                    break;
                case 7:
                    calculateFine(scanner); // should change premium and regular should be done
                    break;
                case 8:
                    System.out.println("Exiting... Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }


        }
    }
}
