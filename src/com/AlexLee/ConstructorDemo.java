package com.AlexLee;

public class ConstructorDemo {

	ConstructorDemo() {
		System.out.println("This is a Constructor");
	}
	
	ConstructorDemo(String str) {
		System.out.println("This is a Constructor with 1 parameter"+str);
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo obj = new ConstructorDemo();
		
		ConstructorDemo obj1 = new ConstructorDemo("My parameter");
		
		
	}
	
	
	
	
	

}
