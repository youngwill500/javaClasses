package com.class7;

public class doWhileLoop {

	public static void main(String[] args) {
	
		
		/// do while is similar to while loop.
		/// Dode will executure while condition is true
		/// EVEN IF CONDITION IS FALSE CODE WILL GET EXECUTED AT LEAST ONCE
		
		
		
		int num = 1;
		
		while (num<=7) {
			System.out.println("Hello");
			num++;
		}
		
		int num1=1;
		
		do {
			
			System.out.println("Bye");
			num1++;
		} while (num1<=7);
		
		
		System.out.println("***********************");
		
		//print even numbers from 20 to 50 using do while
		
		int even=20;
		
		do {
			System.out.println(even);
			even+=2;
		}while(even<=50);
		
		

		
		
		
		
		
		
		
		

	}

}
