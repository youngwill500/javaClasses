package com.syntax.class3;

import java.util.Scanner;

public class lastTask {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean isSunny = false;

		if (isSunny) {
			System.out.println("It is a sunny day, I should go somewhere!");
			if (isSunny) {
				System.out.println("What's the temperature");
				int temperature = scan.nextInt();
				if (temperature >= 85) {
					System.out.println("I am going to the beach");
				} else {
					System.out.println("I am going to the park");
				}

			}
		} else {
			System.out.println("I stay home and practice java!");
		}

	}

}
