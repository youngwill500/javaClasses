package com.ReviewClass7;

public class BabyWorld {

	public static void main(String[] args) {

		Baby Baby1 = new Baby(); //Created an object
		
		Baby1.cry();
		
		Baby1.firstName = "Ryder";
		Baby1.lastName = "Roberts";
		char gender = 'M';
		Baby1.weight = 7;
		Baby1.hairColor="Brown";
		
		Baby1.cry();
		Baby1.walk(5);
		
		System.out.println(Baby1.firstName);
		
		
		
		
		
		
	}

}
