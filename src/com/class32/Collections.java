package com.class32;

// Why do we need Wrapper Class? Using wrapper classes we store converted primitive types inside our collections (number, characters, boolean) 
//Wrapper classes - is class that converts Primitive types into an Object type. 


public class Collections {

	public static void main(String[] args) {
		
		int num = 10; 
		//Autoboxing --> converting primitive type into an Object type
		Integer integer = 100; 
		System.out.println(integer.MIN_VALUE);
		
		String str = integer.toString();
		System.out.println(str);
		
		//converting boolean primitive tpe into Boolean Object type
		Boolean bool = true;
		
		Byte $b=20;
		System.out.println($b.MAX_VALUE);
		
		//Autounboxing --> converting object type into a primitive type
		
		int num1 = new Integer(10);
		
		System.out.println(num1);
		
		
		

	}

}
