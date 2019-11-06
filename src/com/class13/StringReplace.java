package com.class13;

public class StringReplace {

	public static void main(String[] args) {
		
		//This method returns a new string resulting from replace all occurrences of oldChar in this string with newChar
		
		String str= "Hello Dear Dan, how are you Dan, How you been?";
		String str1= "Honesty, I dont care bro";
		
		
		
		System.out.println(str.replace('e', 'z'));  // we used .replace and replaced all 'e', to 'z' 
		
		System.out.println(str.replace("Dear", "Love"));     // we used .replace target, replacement to replace specific words. Here I replaced "Dear with Love"
		System.out.println(str.replaceFirst("Dan", "Sir"));   //This replaces the FIRST Dan, and leaves the rest 

		String str2="12-22-1990"; // 12/22/1990
		
		System.out.println(str2.replace('-', '/'));
		
		
		 
		
		
		
		
		
		
		
		
		
		
		

	}

}
