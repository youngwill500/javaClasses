package com.class24;

public class ThisWithConstructor1 {

	
	 ThisWithConstructor1() {
		System.out.println("This is a constructor without parameters");
	}
	
	 ThisWithConstructor1(String str) {
		this();
		System.out.println("This is a constructor with 1 parameter");
	}
	
	 ThisWithConstructor1(String str, String str1) {
		 this(str));
		 System.out.println("This is a constructor with 2 parameters");
	 }
	
	
	public static void main(String[] args) {
		
		
		ThisWithConstructor1 obj = new ThisWithConstructor1("This is a test"," Seriously cool");
		
		
		
		
	}
	
	
	
}
