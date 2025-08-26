package userdefinedexception_assignments;

import java.util.Scanner;

// Main class for demonstration
public class BankingSystemDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create BankAccount object
        BankAccount account = new BankAccount(1001, 5000.0);

        while (true) {
            System.out.println("\n--- Banking System Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        account.deposit(depositAmount);
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;

                    case 3:
                        account.displayBalance();
                        break;

                    case 4:
                        System.out.println("Thank you for using our banking system!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Try again!");
                }
            } catch (InvalidAmountException | InsufficientFundsException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Transaction attempt completed.");
            }
        }
    }
}

