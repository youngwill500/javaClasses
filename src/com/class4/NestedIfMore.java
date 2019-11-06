package com.class4;

public class NestedIfMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/* Check age, if age is less than 16 -> you are too young to drive
	 * otherwise we will check if you are older than 18 ->
	 * You can get your drivers license and if not you can get drivers permit.
	 */

		int Age=55;
		
		if (Age<16) {
			System.out.println("You are too young to drive");
		}else {
			System.out.println("You are eligible to drive");
			if(Age>=18) {
				System.out.println("You can drive alone");
			}else {
				System.out.println("You need your parents to drive");
			}
		}
		
		
		
		/* We need to check if student completed the quiz
		 * If yes ---> Good job
		 * If no ---> Not Good
		 * If they completed we will check score:
		 * if more than 90--> you got an A
		 * if more than 80--> you got an B
		 * Anything below 80 --> you should study more */
		 
		
		
		boolean quiz=true;
		int score=77;
		
		if (quiz==true) {
			System.out.println("Good Job");
			if (score>90) {
				System.out.println("you got an A");
			} else if (score>80) {
				System.out.println("You got a B");
		}else {
			System.out.println("You should study more");
			
		}
			
		}else {
			System.out.println("Not good");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
