package com.class23;

public class ConstructorDemo {

	
	
		// How can we create a Con
		// 1. it should have exact name as your class name
		// 2. it cannot have return type, not even void
		
		//How constructor is executed:
		
		// Every time when we create an object we call a constructor an entire block of code inside the Constructor will be executed first
		
		// If we do not create any constructor --> compiler will create 1 default constructor 
		
		// Why do we need a constructor? 
		// Constructor initializes OBject
		
	
	 ConstructorDemo(String str) {
		System.out.println("I am constructor with 1 String Parameter "+str);
	}
	 
	 ConstructorDemo(int num, String s) {
			System.out.println("I am constructor with 1 String Parameter "+num);
		}
	 
	 ConstructorDemo(int num) {
			System.out.println("I am constructor with 1 String Parameter "+num);
		}
	 
	
		public static void main(String[] args) {
			
		ConstructorDemo onj = new ConstructorDemo();
		
		
		
		
		

	}

}
