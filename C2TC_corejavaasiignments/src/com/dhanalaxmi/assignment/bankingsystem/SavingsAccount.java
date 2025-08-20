package com.dhanalaxmi.assignment.bankingsystem;


public class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited to Savings Account");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn from Savings Account");
        } else {
            System.out.println("Insufficient Balance in Savings Account");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

