package com.bank;

import java.util.Scanner;

public class Deposit {

    Scanner sc = new Scanner(System.in);

    public void deposit(User user) {

        System.out.print("Enter your PIN : ");
        int enteredPin = sc.nextInt();

        if (enteredPin == user.getPin()) {

            System.out.print("Enter amount to deposit : ");
            double depositBalance = sc.nextDouble();

            user.setBalance(user.getBalance() + depositBalance);

            System.out.println("Amount Deposited Successfully.");

        } else {
            System.out.println("Invalid PIN");
        }

    }

}