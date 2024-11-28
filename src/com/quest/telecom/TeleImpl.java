package com.quest.telecom;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TeleImpl implements TeleInterface{

    private List<Subscriber> subscribers=new ArrayList<>();
    private List<CallRecord> callRecords=new ArrayList<>();



    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("Subscriber added successfully");

    }

    @Override
    public void updateSubscriberBalance(String Id, double newBalance) {
        for (Subscriber s : subscribers) {
            if (s.getSubscriberId().equals(Id) && s.getPlanType().equalsIgnoreCase("Prepaid")) {
                s.setBalance(newBalance);
                System.out.println("Balance updated successfully.");
                return;
            }
        }
        System.out.println("Subscriber not found or not on Prepaid plan.");

    }

    @Override
    public void listSubscribers() {
        System.out.println("Listing all subscribers:");
        for (Subscriber s : subscribers) {
            System.out.println(s);
        }
    }

    @Override
    public void addCallRecord(CallRecord callRecord) {
        callRecords.add(callRecord);
        System.out.println("Call record added successfully.");
    }

    @Override
    public void displayCallHistory(String subscriberId) {
        for (CallRecord callRecord : callRecords) {
            if(callRecord.toString().contains(subscriberId)){
                System.out.println(callRecord);
            }
        }
    }

    @Override
    public void generateBill() {
        double totalBill=0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getPlanType().equalsIgnoreCase("Postpaid")) {
                System.out.println("Generating bill for Subscriber ID: " + subscriber.getSubscriberId());

                for (CallRecord callRecord : callRecords) {
                    if (callRecord.getSubscriberID().equals(subscriber.getSubscriberId())) {
                        switch (callRecord.getCallType().toLowerCase()) {
                            case "local":
                                totalBill = totalBill + callRecord.getDuration();
                                break;
                            case "std":
                                totalBill = totalBill + callRecord.getDuration() * 2;
                                break;
                            case "isd":
                                totalBill = totalBill + callRecord.getDuration() * 5;
                                break;
                        }
                    }
                }
                System.out.println("Total Bill for " + subscriber.getSubscriberName() + ": ₹" + totalBill);
            }
        }
    }

    @Override
    public void saveData(String filename) {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;

        try{
            fos = new FileOutputStream(filename);
            bos = new BufferedOutputStream(fos);


        } catch (Exception e) {
            System.err.println("Error saving data: " + e.getMessage());
        }


    }



    @Override
    public void loadData(String filename) {

    }
}
