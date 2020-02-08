package com.class31;

//Best example of Encapsulation is a class

//To create a tightly encapsulated class we need
//1. create private data members (variables)
//2. create public methods to access those variables (getters and setters)

public class AccountTest {

	public static void main(String[] args) {
	
	
		Account acc = new Account();
		
	acc.setAccountNumber(12345678);
	long accountNumber = acc.getAccountNumber(); //created a variable from Account class
	System.out.println(accountNumber);
	
	acc.setBalance(200);
	double balance = acc.getBalance();
	System.out.println(balance);
		
		
		
	}

}
