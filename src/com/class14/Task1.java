package com.class14;

public class Task1 {

	public static void main(String[] args) {
	
		
		/*
		 *  
			Create a String that will hold a sentence. Write a program to get a new String without any spaces.

	
			

		 * 
		 * 
		 * 
		 */
		
		
		
		//Task1
		
		String str = "This is take 1";
		System.out.println(str.replace(" ", ""));
		
		
		
		
		//Task2    	
		
		// Create a String that should be combination of letters, numbers and special characters. 
		// Find out how many alpha characters are there in the String.
		
		String str1 = "Your Instagram hashtag is @BlackManBlackTie and worth $75,000";
	
		System.out.println();
		
	//	char [] array = str1.toCharArray();
		
	//	for(char i:array ) {
			
			
		
		
		
		
		
				//You have a String a=”Is it Saturday? Is it raining? Do we have a Java Class today?” 
				//How would you find out how many sentences are in that String?
		
		
		
		
		
		String str3 = "Is it Saturday? Is it raining? Do we have a Jave Class today?";
		
		String[] array=str3.split("\\?"); 
		System.out.println(array.length);
		
	//	for(String string:array) {                       
	//		System.out.println(string.trim());
	//	}
		
		
				
				
		
		
		
		
		
		
		
		
		
		
	}

}
