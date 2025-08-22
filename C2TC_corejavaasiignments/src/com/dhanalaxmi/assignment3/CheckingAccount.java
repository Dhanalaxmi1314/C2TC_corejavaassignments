package com.dhanalaxmi.assignment3;

public class CheckingAccount extends Account {

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited to Checking Account");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn from Checking Account");
        } else {
            System.out.println("Insufficient Balance in Checking Account");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
