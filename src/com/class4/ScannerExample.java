package com.class4;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner is a class in Java that will allows us to take an input from a user.
		//Scanner will help us to make our program more interactive
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any number");
		/*nextInt(); > For numbers
		 * nextLine(); Strings
		 * nextDouble(); > double
		 */
		int number=scan.nextInt();
		System.out.println("Entered number is "+number);
		System.out.println("*****************");
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=input.nextLine();
		System.out.println("Good afternoon "+name);
		
		
		
	}

}
