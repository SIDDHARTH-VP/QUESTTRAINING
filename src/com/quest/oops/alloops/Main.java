package com.quest.oops.alloops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = null;

        while (true) {
            System.out.println("\n--- Bank Account Management System ---");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. View Account Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNum = sc.nextInt();
                    System.out.print("Enter Account Holder Name: ");
                    String accName = sc.next();
                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();
                    account = new SavingsAccount(accNum, accName, balance);
                    System.out.println("Savings Account created successfully!");
                    break;
                case 2:
                    System.out.print("Enter Account Number: ");
                    int accNumc = sc.nextInt();
                    System.out.print("Enter Account Holder Name: ");
                    String accNamec = sc.next();
                    System.out.print("Enter Initial Balance: ");
                    double balancec = sc.nextDouble();
                    account = new SavingsAccount(accNumc, accNamec, balancec);
                    System.out.println("Savings Account created successfully!");
                    break;
                case 3:
                    if (account != null) {
                        System.out.print("Enter Deposit Amount: ");
                        double amount = sc.nextDouble();
                        Transaction deposit = new Deposit(account, amount);
                        deposit.processTransaction();
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;
                case 4:
                    if (account != null) {
                        System.out.print("Enter withdrawal Amount: ");
                        double amount = sc.nextDouble();
                        Transaction withdraw = new Withdraw(account, amount);
                        withdraw.processTransaction();
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;
                case 5:
                    if (account != null) {
                        System.out.println("\nAccount Details:");
                        System.out.println("Account Number: " + account.getAccountNumber());
                        System.out.println("Account Holder Name: " + account.getAccountHolderName());
                        System.out.println("Balance: " + account.getBalance());
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");


            }


        }
    }

}

