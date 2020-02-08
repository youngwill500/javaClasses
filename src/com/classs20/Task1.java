package com.classs20;

//Create a method that will take 1 parameter as a String and return reversed String. Method should be visibly only within same package. 


public class Task1 {

	public static void main(String[] args) {
	Task1 task = new Task1();
	
	String result = task.reverseString("Syntax");
	System.out.println(result);
		
	}
	
		
	String reverseString(String param) {
		
		String result = "";
		
		char [] charArray = param.toCharArray();
		
		for (int i = charArray.length-1; i >= 0; i--) {
			result += charArray[i];
		
		}
		
		
		return result;
	}
		
		
		

	

}
