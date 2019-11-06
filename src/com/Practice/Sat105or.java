package com.Practice;

import java.util.Scanner;

public class Sat105or {

	
	// 7 days a week
	// if day is 2 or 4 ---> SDLC class
	// if day 6 or 7 ---> Java Class
	// if day 1 or 5 ---> No Class
	// if day =3 --> review class

	// || = Or, only one has to be true
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("What's your schedule?");
		int day = scan.nextInt();
		
		if (day==2 || day==4) {
			System.out.println("SDLC Class");
		}else if (day==6 || day==7) {
			System.out.println("Java Class");
		}else if (day==1 || day==5) {
			System.out.println("No Class");
		}else if (day==3) {
			System.out.println("review class");
		}
		
		
		
		
	}

}
