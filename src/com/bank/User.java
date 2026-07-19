package com.bank;
import java.util.Scanner;

public class User {

	private int accNumber=973448282;
	private String accHolder="Ashu";
	private double balance=20000;
	private int pin=1234;
	
	public double getBalance()
	{
	    return balance;
	}

	public void setBalance(double balance)
	{
	    this.balance = balance;
	}
	
	
	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void bankingOperation()
	{
		int choice;
		do
		{
			System.out.println("===================");
			System.out.println(".....Welcome.....");
			System.out.println("===================");
			System.out.print("Choose Option");
			System.out.println("1--Check Balance");
			System.out.println("2--Deposit Balance");
			System.out.println("3--Withdraw Balance");
			System.out.println("4--See Details");
			System.out.println("5--Exit");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose your Option");
			choice = sc.nextInt();
			
			
			switch(choice)
			{
				case 1:
					CheckBalance ch = new CheckBalance();
					ch.balanceCheck(this);
					break;
				case 2:
				    Deposit d = new Deposit();
				    d.deposit(this);
				    break;
				case 3:
					Withdraw w=new Withdraw();
					w.withdraw(this);
					break;
				case 4:
					DisplayDetails details=new DisplayDetails();
					details.showDetails(this);
					break;
				case 5:
					System.out.println("Thank you !!!");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice");
					break;
			}
			
			sc.close();
		}
		while(choice!=5);
	}
	
}
