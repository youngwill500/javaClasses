package com.class19;

public class MethodsWithReturnValue {

	public static void main(String[] args) {
	
		// Declare a string and if string has more than 6 characters we say String is large ortherwise string is small
		// 
		
		
		String str = "Welcome Home";
		
		int numOfChars = str.length();
		
		if(numOfChars >= 10) {
			System.out.println("String is large");
		}else {
			System.out.println("String is small");
		}
		
		
		
		char character = str.charAt(4);
		System.out.println(character);
		
		
		
		
		//create an object of the class where method is defined
		
		recap obj = new recap();
		//int num = obj.sum(5, 10); compilee error saying change return type
		obj.sum(50, 50);
		
		MethodsWithReturnValue obj1 = new MethodsWithReturnValue();
		int sum = obj1.sum(50, 50);
		System.out.println(sum);
		
		MethodsWithReturnValue obj2 = new MethodsWithReturnValue();
		int Large = obj2.findLargest(5, 10);
		System.out.println(Large);
		
	}
		
	//return type, method name (list of parameters
	int sum(int num1, int num2) {
		int c = num1+num2;
		return c;
	}
	
	
	
	
	
	//method to find largest number
	int findLargest(int num4, int num5) {
		
		int largest;
		
		if (num4>num5) {
			largest = num4;
		}else {
			largest = num5;
		}
		return largest;
		
	}
		

	
	
	
	
	
	
	}


