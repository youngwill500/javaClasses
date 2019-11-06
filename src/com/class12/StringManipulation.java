package com.class12;

public class StringManipulation {

	public static void main(String[] args) {

	//There are two ways to create string objects.
		
		//1
		//String Literal
		String name = "John";
		System.out.println(name);
		System.out.println("The length of name is = "+ name.length()); 
				
		
		//2
		//Creating string with new key word
		String name1 = new String("John1");
		System.out.println(name1);
		
		/*
		 * This method returns the length of this string.
		 * The length is equal to the number 
		 * of 16-bit Unicode characters in the string.
		 * 
		 * 
		 * 
		 */
		System.out.println("*********************");
		
		int name1Len=name1.length();
		System.out.println("The length of name1Len is= " +name1Len);
		
		
		//Converts all letters to Lowercase
		String str1= "Hello World";
		System.out.println("Before:: "+str1);    //Before
		
		str1 = str1.toLowerCase();               
		System.out.println("After:: "+str1);     //After
		
		System.out.println("*********************");
		
		//.equals()
		String str2 = "HelLo WoRld";
		
		boolean isEqual = str1.equals(str2);
		System.out.println(isEqual);
		
		//.equalsIgnoreCase();
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println("*********************");
		
		String str3="Mohammad";
		System.out.println("Before: "+str3);
		
		str3=str3.toUpperCase();
		System.out.println("After: "+str3);
		
		
		
		
		
		
	}

}
