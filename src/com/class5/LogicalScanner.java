package com.class5;

import java.util.Scanner;

public class LogicalScanner {

	public static void main(String[] args) {
		
		/* Ask user to enter age
		 * if age is from 1 to 3 ---> you are a baby
		 * if age is from 3 to 5 ---> you are a toddler
		 * if age from 5-12 ---> you are a kid
		 * if age from 12-19 ----> teenager
		 * if age > 20 ----> you are an adult
		 * 
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("How old are you?");
		int age = scan.nextInt();
		
		
		
		if (age>=1 && age<=3) {
			System.out.println("You are a baby");
		}else if (age>3 && age<=5) {
			System.out.println("You are a toddler");
		}else if (age>=5 && age<=12) {
			System.out.println("You are a teenager");
		}else if (age>12 && age <=19) { 
			System.out.println("You are an adult");
		}else {
			System.out.println("Invalid");
		}
		
		
		
		
//		Scanner scan = new Scanner (System.in);
//		System.out.println("how old are you");
//		int age = scan.nextInt();
//	
//		if (age>=0 && age<3) {
//			System.out.println("You are a baby");
//		}else if (age>=3 && age<5) {
//			System.out.println("You are a toddler");
//		}else if (age>=5 && age<12) {
//			System.out.println("You are a teenager");
//		}else if ( age>=20) { 
//			System.out.println("You are an adult");
//		}
		

	}

}
