package com.class15;

import java.util.Scanner;

public class StringManipulationsTask {

	public static void main(String[] args) {
		
		//lets ask user to enter browser based on the input we say "Your selected browser is" __________________
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter browser name");
		String browser = scan.nextLine();
		
		
		switch (browser.toLowerCase()) {                     //What The user inputs, switch case will convert it lower case and checking the equality 
		case "firefox":
			System.out.println("Execution can be performed on "+browser);
			break;
		case "chrome":
			System.out.println("Execution can be performed on "+browser);
			break;
		case "safari":
			System.out.println("Execution can be performed on "+browser);
			break;
		case "IE":
			System.out.println("Execution can be performed on "+browser);
			break;
		default:
			System.out.println("Please enter valid browser");
		}
		
		// Switch case checks equality // If
		
		
		

	}

}
