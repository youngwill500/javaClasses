package com.Review;

import java.util.Scanner;

public class IfandE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Do you have a Credit Card?");
		boolean Credit = scan.nextBoolean();

		if (Credit == false) {
			System.out.println("Please sign up for a card");

		} else {
			System.out.println("What is your current balance?");

			int balance = scan.nextInt();

			if (balance >= 1000) {
				System.out.println("Please pay off your card");

			} else {
				System.out.println("You can spend more money");
			}
		}

	}

}
