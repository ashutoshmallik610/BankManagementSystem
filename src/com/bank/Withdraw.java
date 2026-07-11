package com.bank;

import java.util.Scanner;

public class Withdraw {

    Scanner sc = new Scanner(System.in);

    public void withdraw(User user) {

        System.out.print("Enter your PIN : ");
        int enteredPin = sc.nextInt();

        if (enteredPin == user.getPin()) {

            System.out.print("Enter amount to withdraw : ");
            double withdrawBalance = sc.nextDouble();

            if (withdrawBalance <= user.getBalance()) {

                user.setBalance(user.getBalance() - withdrawBalance);

                System.out.println("Amount Withdrawn Successfully.");

            } else {
                System.out.println("Insufficient Balance");
            }

        } else {

            System.out.println("Invalid PIN");

        }

    }

}