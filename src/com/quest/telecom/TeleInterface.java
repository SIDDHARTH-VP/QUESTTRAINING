package com.quest.telecom;

public interface TeleInterface {

     void addSubscriber(Subscriber subscriber);
     void updateSubscriberBalance(String Id, double newBalance);
     void listSubscribers();

     void addCallRecord(CallRecord callRecord);
     void displayCallHistory(String subscriberId);

     void generateBill();

     void saveData(String filename);
     void loadData(String filename);
}
