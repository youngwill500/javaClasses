package com.Review;

import java.util.Scanner;

public class Excersise {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Do you have a Credit Card? True or False");
		boolean CC=input.nextBoolean();
		
		if (CC) {
			
			System.out.println("What is the balance on your card?");
			int balance=input.nextInt();
			
			if (balance>1000) {
				System.out.println("Please pay off your balance");
			}else {
			System.out.println("You can spend more money");
		}
		}else {
			System.out.println("Would you like to apply for credit card");
		}
		


	}

}
