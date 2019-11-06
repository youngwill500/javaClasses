package com.syntax.class3;

public class practiceTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a program with one int value for salary and four String values for
		// different cars
		// If you make over 50000 a year, you may buy a brand new car otherwise you
		// should buy a used car. For those you can afford a new car there are different
		// price ranges
		// I want anything under 70k to be Audi A5
		// I want anything under 80k to be Mercedes-Benz
		// I want anything under 90k to be Jaguar
		// I want anything under 100k to be Tesla
		// And if you make less than 60k output to read "Save up money and wait until
		// next year"
		
		int Salary = 55000;
		
		if (Salary >= 50000) {
			System.out.println("You may buy a brand new car");
			 if (Salary >= 70000) {
			System.out.println("You can buy an Audi A5");	 
			 }else if (Salary >= 80000) {
				 System.out.println("You can get a benz");
			 } else if (Salary >= 90000) {
				 System.out.println("You can get a Jaguar");
			 }else if (Salary >= 100000) {
				 System.out.println("You can get a Tesla");
			 }else if (Salary <= 60000) {
				 System.out.println("Wait until next year");
			 }
		
		
		
		
		
		
		
		
		
		}else {
			System.out.println("You should buy a used car");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
