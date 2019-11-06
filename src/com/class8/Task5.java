package com.class8;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		// Print numbers from 1 to 50 except those that divisible by 3

		for (int i = 1; i <= 50; i++) {
			if (i % 3 != 0) {
				System.out.println(i);

			}

		}

		// Create a program that will be asking user to apply for a Credit Card 10
		// times.
		// As soon as you get a "yes" from a user program should stop asking.

		String card;
		Scanner scan = new Scanner(System.in);

		for (int q = 1; q <= 10; q++) {
			System.out.println("Do you have a credit card?");
			card = scan.nextLine();
			if (card.equalsIgnoreCase("Yes"))
				break;
		}

	}

}
