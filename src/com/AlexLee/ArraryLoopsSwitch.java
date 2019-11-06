package com.AlexLee;

public class ArraryLoopsSwitch {

	public static void main(String[] args) {
		
		
		//Create an array of countries. While retrieving all values from an array print capital
		// for each country. (use 2 different loops).
		
		
		
		
		
		
		

		String[] States = { "New York", "California", "Florida", "Washington" };

		int Size = States.length;

		for (int i = 0; i < Size; i++) {
			System.out.println(States[i]);

			switch (States[i]) {

			case "New York":
				System.out.println("NYC");
				break;
			case "California":
				System.out.println("Los Angeles");
				break;
			case "Florida":
				System.out.println("Miami");
				break;
			case "Washington":
				System.out.println("Seattle");
				break;

			}

		}

	}

}
