package com.class31;

public class Account {
	
	 private long accountNumber;
	 private double balance;
	 
	 //Getters // Allowing access into the information 
	 
	 public long getAccountNumber() {
		 return accountNumber;
	 }
	 
	 public double getBalance() {
		 return balance;
	 }
	 
//setter
	 public void setBalance(int amount) {
		 if(amount > 0) {
			 balance = balance+amount; 
		 }else {
		 
	 }
	 
	 public void setAccountNumber(long accountNumber) {
		 this.accountNumber = accountNumber;
	 }
	
}
