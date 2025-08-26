package userdefinedexception_assignments;

// Importing exceptions from the same package
// (no need to explicitly import because they are in the same package)

public class BankAccount {
    private int accountNumber;
    private double balance;

    // Parameterized constructor
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than 0!");
        }
        balance += amount;
        System.out.println("Successfully deposited: " + amount);
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than 0!");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds! Your balance is: " + balance);
        }
        balance -= amount;
        System.out.println("Successfully withdrawn: " + amount);
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Account No: " + accountNumber + " | Current Balance: " + balance);
    }
}
