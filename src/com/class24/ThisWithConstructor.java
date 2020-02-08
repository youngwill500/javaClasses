package com.class24;

public class ThisWithConstructor {
	
	
	ThisWithConstructor(){
		System.out.println("I am a non argument constructor");
	}
	
	
	ThisWithConstructor(String str) {
		this(); //used to call current class constructor --> ThisWithConstructor()
		System.out.println("I am constructor with 1 string parameter");
	}

	ThisWithConstructor(String str, String str1) {
		this(str);
		System.out.println("I am a constructor with 2 params");
	}
	
	
	public static void main(String[] args) {
		
	//	ThisWithConstructor obj = new ThisWithConstructor("Hello");
		//can we execute 2 constructors at the same time?
		// yes - it can be achieved using "this()" 
		
		ThisWithConstructor obj1 = new ThisWithConstructor("Hello","Bye");
		
	}
	
	
	
}
