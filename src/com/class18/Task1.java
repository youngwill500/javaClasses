package com.class18;

public class Task1 {
	
	
	// Create a method that will take 2 parameters as a numbers and prints which number is larger.
	
	void numbers(int num1,int num2) {    // We're using two parameters that we call below
		
		if (num1>num2) {
			System.out.println(num1+" is larger than "+num2);
		}else {
			System.out.println(num2+" is larger than "+num1);
		}
		
	}
	
	

	// Create a method that will take a number and prints whether the number is even or odd.
	
	void numbers2(int num3) { //We called one parameter
		
		if (num3%2==0) {
			System.out.println("The number is even");
		}else {
			System.out.println("The number is odd");
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
	Task1 obj = new Task1();
	
	obj.numbers(5, 10);
	obj.numbers2(4);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}

