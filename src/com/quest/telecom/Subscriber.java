package com.quest.telecom;

import java.io.Serializable;

public class Subscriber  implements Serializable{
    private String subscriberId;
    private String subscriberName;
    private long number;
    private String planType;
    private double balance;
    public Subscriber(String subscriberId, String subscriberName, long number, String planType, int balance) {
        this.subscriberId = subscriberId;
        this.subscriberName = subscriberName;
        this.number = number;
        this.planType = planType;
        this.balance = balance;
    }

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "subscriberId='" + subscriberId + '\'' +
                ", subscriberName='" + subscriberName + '\'' +
                ", number=" + number +
                ", planType='" + planType + '\'' +
                ", balance=" + balance +
                '}';
    }
}
