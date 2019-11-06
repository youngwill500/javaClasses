package com.class13;

public class RegularExpression {

	public static void main(String[] args) {

		
		/*
		 * print only text and not numbers
		 * 
		 */

		String str = "1234Hel456lo234234234";                             
				System.out.println(str.replaceAll("[0-9]", ""));               //Leave only text
				System.out.println(str.replaceAll("[a-zA-Z]", ""));				// Leave only numbers.
		
							
				
		String str2="Hi#$%How#$%#$4356346";          
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]",""));            //Remove everything except text and numbers
		
		
		System.out.println(str2.replaceAll("//W", ""));
		
		
		
		
	}

}
