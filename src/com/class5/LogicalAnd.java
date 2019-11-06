package com.class5;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Do you have a CC?");
		boolean CC = scan.nextBoolean();

		if (CC) {
			System.out.println("What is your balance?");
			int balance = scan.nextInt();

				if (balance >= 1000) {
					System.out.println("Please pay off card");
					} else {
					System.out.println("You can spend more money");
				    } 
				}else {
			System.out.println("Please sign up for a card");
			
		}

	}

}
