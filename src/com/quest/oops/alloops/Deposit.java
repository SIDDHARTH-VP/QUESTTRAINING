package com.quest.oops.alloops;

public class Deposit extends Transaction{
    private double amount;
    public Deposit(BankAccount account, double amount) {
        super(account);
        this.amount = amount;
    }

    @Override
    public void processTransaction() {
        if(amount > 0){
            account.deposit(amount);
        }
    System.out.println("Deposited " + amount + " to account " + account.getAccountNumber());
    }
}
