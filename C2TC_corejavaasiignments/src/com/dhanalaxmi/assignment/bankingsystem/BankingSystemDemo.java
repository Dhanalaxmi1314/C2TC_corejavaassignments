package com.dhanalaxmi.assignment.bankingsystem;



public class BankingSystemDemo {
    public static void main(String[] args) {
        // Static example
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();
        System.out.println("Total Accounts in Bank: " + Bank.getTotalAccounts());

        // Abstract + Inheritance example
        Account savings = new SavingsAccount(1000);
        Account checking = new CheckingAccount(2000);

        // Final example
        Transaction transaction = new Transaction();
        transaction.performTransaction(savings, 200, "deposit");
        transaction.performTransaction(checking, 500, "withdraw");
    }
}

