package com.dhanalaxmi.assignment5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read booking details in CSV format
        String bookingDetails = sc.nextLine();
        String[] details = bookingDetails.split(",");
        TicketBookin booking = new TicketBookin(details[0], details[1], Integer.parseInt(details[2]));

        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        booking.displayBooking();

        switch (choice) {
            case 1: // Cash
                double amount1 = sc.nextDouble();
                sc.nextLine();
                booking.makePayment(amount1);
                break;

            case 2: // Wallet
                double amount2 = sc.nextDouble();
                sc.nextLine();
                String walletNumber = sc.nextLine();
                booking.makePayment(amount2, walletNumber);
                break;

            case 3: // Credit card
                String holderName = sc.nextLine();
                double amount3 = sc.nextDouble();
                sc.nextLine();
                String creditCardType = sc.nextLine();
                String ccv = sc.nextLine();
                booking.makePayment(holderName, amount3, creditCardType, ccv);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}


