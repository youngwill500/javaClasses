package com.class19;

public class recap {

	void sum(int num1, int num2) {             //Creating a method and including a parameter (int num1, int num2)

		int c = num1 + num2;
		System.out.println("The sum of 2 numbers is = " + c);

	}
	
	//create method to display hello 5 times
	
	void hello(int times) {                        //Used parameter and declared int so we can say it as many times as we want
		for(int i = 0; i <=times; i++) {           //replaced 5 with times, so when we can it it prints as many times as we want  
			System.out.println("Hello");
		}
	}
	

	
	
	
	public static void main(String[] args) {
		recap obj = new recap(); //Creating a new object

		obj.sum(10, 30); //Calling the message sum, also inputing the Parameters 
		obj.hello(3);
		

	}

}
