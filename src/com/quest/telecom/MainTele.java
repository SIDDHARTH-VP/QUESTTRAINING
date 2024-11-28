package com.quest.telecom;

import java.util.Date;
import java.util.Scanner;

public class MainTele {
    public static void main(String[] args) {
        TeleInterface tele = new TeleImpl();

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Welcome to the Telecom Subscriber Management System (TSMS)");

            System.out.println("\nMenu:");
            System.out.println("1. Add Subscriber");
            System.out.println("2. Update Subscriber Balance");
            System.out.println("3. List All Subscribers");
            System.out.println("4. Add Call Record");
            System.out.println("5. Display Call History");
            System.out.println("6. Generate Bill");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addSubscriber(tele, scanner);
                    break;

                case 2:
                    updateSubscriberBalance(tele, scanner);
                    break;

                case 3:
                    tele.listSubscribers();
                    break;
                case 4:
                    addCallRecord(tele, scanner);
                    break;
                case 5:
                    System.out.print("Enter Subscriber ID: ");
                    String historyId = scanner.nextLine();
                    tele.displayCallHistory(historyId);
                    break;
                case 6:
                    tele.generateBill();
                    break;
                case 7:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 7);
        scanner.close();
    }


    private static void addSubscriber(TeleInterface tele, Scanner scanner) {
        System.out.print("Enter Subscriber ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        long number = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Enter Plan Type (Prepaid/Postpaid): ");
        String planType = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        int balance = scanner.nextInt();
        scanner.nextLine();

        Subscriber subscriber = new Subscriber(id, name, number, planType, balance);
        tele.addSubscriber(subscriber);
    }

    private static void updateSubscriberBalance(TeleInterface tele, Scanner scanner) {
        System.out.print("Enter Subscriber ID: ");
        String subscriberId = scanner.nextLine();
        System.out.print("Enter New Balance: ");
        double newBalance = scanner.nextDouble();
        tele.updateSubscriberBalance(subscriberId, newBalance);
    }

    private static void addCallRecord(TeleInterface tele, Scanner scanner) {
        System.out.print("Enter Subscriber ID: ");
        String callSubId = scanner.nextLine();
        System.out.print("Enter Call Type (Local/STD/ISD): ");
        String callType = scanner.nextLine();
        System.out.print("Enter Call Duration (in minutes): ");
        int duration = scanner.nextInt();
        scanner.nextLine();
        Date timestamp = new Date();

        CallRecord callRecord = new CallRecord(callSubId, callType, duration, timestamp);
        tele.addCallRecord(callRecord);
    }

}
