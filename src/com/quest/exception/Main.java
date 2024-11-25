package com.quest.exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new StLibrary(5, 3);
        while (true) {
            try {
                System.out.println("Enter books to borrow");
                int books = sc.nextInt();
                sc.nextLine();
                library.borrowBook(books);

            } catch (IOException e) {
                System.out.println("IO Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input! Please enter a numeric value.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input! Please enter a numeric value." + e.getMessage());
                sc.nextLine();
            } finally {
                System.out.println("Executed the operation");
            }

            String choice = null;
            try {
                System.out.print("Do you want to borrow again? (yes/no): ");
                choice = sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            if (!choice.equals("yes")) {
                System.out.println("Thank you for using the Library Management System!");
                break;
            }
        }
    }
}


//dont do any logic in exception class