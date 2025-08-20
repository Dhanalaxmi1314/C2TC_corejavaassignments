package com.dhanalaxmi.assignment.bankingsystem;

public class Transaction {
    private final double transactionFee = 1.5; // fixed fee

    // final method so it can't be overridden
    public final void performTransaction(Account account, double amount, String type) {
        if (type.equalsIgnoreCase("deposit")) {
            account.deposit(amount);
        } else if (type.equalsIgnoreCase("withdraw")) {
            account.withdraw(amount);
        }

        // deduct the fee after every transaction
        account.withdraw(transactionFee);
        System.out.println("Transaction fee of " + transactionFee + " applied");
        System.out.println("New Balance: " + account.getBalance());
    }
}
