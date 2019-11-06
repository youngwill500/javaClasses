package com.class12;

public class StringManipulation3 {

	public static void main(String[] args) {
	
		
		/*
		 * 
		 * This method checks wether a String is empty or not.
		 * This method returns true if the given string
		 * is empty, else it returns false.
		 * 
		 * 
		 */
		
		String str="";
		System.out.println("Is this string empty= "+str.isEmpty());
		
		String str2="Hello";
		System.out.println("Is this string empty= "+ str2.isEmpty());
		
		
		if(!str.isEmpty() ) {
			System.out.println("This is not empty");
		}else {
			System.out.println("This is empty String");
		}
		
		System.out.println("***************************************");
		
		//              \n brings a long sentence to a new line 
		String sentence = "Each day has a promise to promise to brighten up the day, \nBut first you must allow the sun to come your way";
		System.out.println(sentence);
		
		System.out.println("***************************************");
		
		/*
		 * This method appends one String to the end of another
		 * The method returns a String with the value of the 
		 * String passed in the method appended to the end of the String used to invoke this method.
		 * 
		 * 
		 * 
		 */
		
		// You can .conact multiple
		
		String str3="Hello";
		String str4="World";
		String str5="People";
		System.out.println(str3+str4);
		System.out.println(str3.concat(str4).concat(str5));
		
		System.out.println("***************************************");
		
		/*
		 * This method returns a copy of the string, with leading and trailing whitespace omitted.
		 * 
		 * Trims unnecssary space at the beginning and the end 
		 */
		
		String str6=" How are you? ";
		System.out.println(str6.trim());
		
		
		System.out.println("***************************************");
		
		
		/*
		 * This method returns the character located at the String's specified index.
		 * The string indexes start from zero 
		 */
		
		String str7="We might be done early today";
		System.out.println(str7.charAt(3));
		
		
		System.out.println("***************************************");
		
		/* This method returns the index within this string of the first occurrence of the specified character
		 * or -1 of the character does not occur.
		 * 
		 * when looking for a letter not found, the input will be "-1"
		 */
		
		String str8="We might not be done early";
		System.out.println(str8.indexOf('m'));
		
		System.out.println(str8.indexOf('m',12));   //letter// index # to begin search from letter

	}

}
