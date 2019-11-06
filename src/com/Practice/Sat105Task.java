package com.Practice;

import java.util.Scanner;

public class Sat105Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("What was the grade on your Quiz?");
	   int Quiz = scan.nextInt();
		
		System.out.println("What was the grade on your Midterm?");
		int midterm = scan.nextInt();
		
		System.out.println("What was your Final grade?");
		int Final = scan.nextInt();
		
		
		if (Quiz >= 90) 
			if (midterm >= 90)
				if (Final >= 90)
		{
			System.out.println("Grade = A");
		} else {
			System.out.println("You failed bruh");
		}
		
		
		

	}

}
