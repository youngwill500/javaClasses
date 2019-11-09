package com.class15;

public class StringManipulationExamples {

	public static void main(String[] args) {
	
		
	String str = "Syntax Technologies Inc";
	
	char letter=str.charAt(5);      //Prints the character chosen in the index() 
	System.out.println(letter);
	//length = 19
	// System.out.println(str.charAt(str.length()));   //This prints what's in the (    ) first, which is 19 which is more than the total of "str" 
	System.out.println(str.charAt(str.length()-1));	// This prints the last character (Practice this)
	
	//Get a substring from a String
	//Syntax
	String substr1 = str.substring(0, 6);
	System.out.println(substr1);	
		
	String substr2 = str.substring(7);  //Prints The rest of the string after specified # 
	System.out.println(substr2);
	
	// Replace
	String str2 = "Java classes at Syntax are awesome";    
	str=str.replace("awesome", "great");   // replaces the word "awesome" with "great" in the sentence; 
	System.out.println(str2);
	
	//replaceAll --> specify regular expression 
	
	//lets remove all special characters
	str.replaceAll("[^A-Za-z0-9", "");
	System.out.println(str);
	
	//split
	String myString = "Java classes at Syntax are awesome";
	String[] array = myString.split("c");
	System.out.println(array.length);
		
		
		
		
		
		
		

	}

}
