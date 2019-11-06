package com.class8;

public class BreakAndContinue {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i == 2) {
				break; //// break stops the loop from repeating
			}
			System.out.println(i);
		}
			System.out.println("I am outside the loop");
	
			
			//continue - it will skip CURRENT iteration
			
			
			for (int i=1; i<=5; i++) {
				
				if(i==3) {
					continue;
				}
				System.out.println(i);
				
			}
	
			System.out.println("I am outside the loop");
	
	//break & continue keyword can be used inside ANY loop
					//Mostly it will be used within if statement
			
			//break vs continue
			//break -> exits the loop
			//
	
	
	
	
	
	
	
	}

}
