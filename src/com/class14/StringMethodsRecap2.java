package com.class14;

public class StringMethodsRecap2 {

	public static void main(String[] args) {
		
		
	//.replace
		
	String str="your Syntax Tech";
	
	System.out.println(str.replace('y', 'i'));
		
	System.out.println("******************");
	System.out.println(str.replace("your", "My"));
		
	System.out.println("******************");	
	//.replaceAll
	
	String str2="";
	
	//System.out.println(str2.replaceAll(regex, replacement));
	
	
	System.out.println(str.replaceAll("Tech(.*)","")); //Prints everything up to that word
	
	
	String str3="23423Hell3049o";
	System.out.println(str3.replaceAll("[0-9]", "")); // Removes all the numbers
		
	
	
	
		
		
		
		
		
		
		
		

	}

}
