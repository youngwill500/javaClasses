package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
	
		//This method splits this string around matches of the given regular expression
		
		
		String str = "Video provides a powerful way to help you provde your point";
		
		String[] array=str.split(" ");
		
		for(int i=0; i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("************************");
		
		//How can we find how many sentences are in the following string;
		
		String str1="Today is Sunday. Its Sunnday Day. And we are having java class.";
		
		String[] array2=str1.split("\\."); // \\. Allows us to use the period
		System.out.println(array2.length);
		
		for(String string:array2) {                       
			System.out.println(string.trim());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
