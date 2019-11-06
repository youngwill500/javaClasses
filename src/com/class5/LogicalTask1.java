package com.class5;

public class LogicalTask1 {

	public static void main(String[] args) {
		
		
		int Day=9;
		
		if (Day==1 && Day<5) {
			System.out.println("It is a weekday");
		}else if (Day==6 || Day==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid Day");
		}

		
		float Height=2;
		
		if (Height<5.5) {
			
			System.out.println("Short");
			
		}else if (Height>=5 && Height<=6) {
			System.out.println("Medium");
			
		}else {
			System.out.println("Dumb Tall");
		}
		
	}

}
