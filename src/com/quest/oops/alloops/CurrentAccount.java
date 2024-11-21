package com.quest.oops.alloops;

public class CurrentAccount extends BankAccount{
    public static final double OVR_DRAFT=2000;
    public CurrentAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }
    @Override
    public boolean withdraw(double amount) {
        if(getBalance() - amount >= OVR_DRAFT){
            return super.withdraw(amount);
        }else {
            return false;
        }
    }
}
