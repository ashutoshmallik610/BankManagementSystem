package com.bank;

public class DisplayDetails {
	
	public void showDetails(User user)
	{
		System.out.println("Account Holder Name : "+user.getAccHolder());
		System.out.println("Account Number : "+user.getAccNumber());
		System.out.println("Balance : "+user.getBalance());
		System.out.println("PIN : "+user.getPin());

		
	}

}
