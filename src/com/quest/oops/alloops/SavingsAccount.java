package com.quest.oops.alloops;

public class SavingsAccount extends BankAccount {
//public static final double MIN_BAL=500;
    public SavingsAccount(int accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }
    @Override
    public boolean withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful. Remaining balance: " + getBalance());
            return true;

        }
        System.out.println("Not enough money to withdraw");
        return false;
        }
    }

