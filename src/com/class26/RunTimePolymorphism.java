package com.class26;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		
		
		//widening 
		double d = 90;
		
		//narrowing
		int i = (int)1.99;
		
		//Non primitive Typecasting
		//widening -> creating an object of the class and giving reference to the parent class
		
		Animal obj = new Cat();
		//narrowing
		Cat obj2 = new Animal(); ---> Cannot convert from Subclass() to Subclass
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
