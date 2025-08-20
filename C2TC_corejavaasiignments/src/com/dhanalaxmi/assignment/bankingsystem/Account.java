
package com.dhanalaxmi.assignment.bankingsystem;

public abstract class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract double getBalance();

    // Common behavior for both account types
    public void printBalance() {
        System.out.println("Current balance: " + balance);
    }
}
