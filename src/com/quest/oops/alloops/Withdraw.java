package com.quest.oops.alloops;

public class Withdraw extends Transaction{
    double amount;
    public Withdraw(BankAccount account, double amount) {
        super(account);
        this.amount = amount;
    }

    @Override
    public void processTransaction() {
        if(account.withdraw(amount)){
            System.out.println("Withdraw successful"+amount);
        }else{
            System.out.println("Withdraw failed insufficient balance");
        }


    }
}
