package com.class15;

public class StringManipulations {

	public static void main(String[] args) {
		
	//String class comes in java lang package
		// A string is a sequence of charachters
		
		//2 ways to create a String
		//first way -- String literal 
		String str = "Hello";
		//second way -- creates an object 
		String str1 = new String ("hello");
		
		//Inside String class we many many methods that can be performed on Strings:
		
	//  1. Find the number of characters inside the String
	//	.length
		
	int length = str.length();
	System.out.println(length);
		
		
	//case conversion methods/functions
	
	str=str.toLowerCase(); //assigns str to lowerCase, moving forward it will be lower case 
	System.out.println(str.toLowerCase()); // Will print out lower case, but not assigned. str=str.toLowerCase(); assigns it 
		
	//verify if there is any characters in the string 	
	String myString="";						//Empty Value
	boolean isEmpty = myString.isEmpty();   //Returns in boolean, showing wether or not its true or false
	System.out.println(isEmpty);
	
	String myString1 = null; //No value at all
	System.out.println(myString1.isEmpty());
	
	//how to verify existence of characters in the string // It is case sensitive
	String a="Good evening students";
	boolean exist=a.contains("Students");
	System.out.println(exist);
		
	//how to verify if a string begins or ends with:
	System.out.println(a.startsWith("Good"));
	System.out.println(a.endsWith("Students"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
