package com.class13;

public class StringSubStringMethod {

	public static void main(String[] args) {
	
		String str = "Java is getting interesting";
		
		
		//SubString
		//This method returns 
		
		System.out.println(str.substring(15));
		
		
		System.out.println(str.substring(8,15));    // 8 is the beginning, 15 is the end. This provides the range. 
		
		
		/* 
		 * 	S=[0] , u=[1], n=[2], d=[3], a=[4], y=[5]
			day.length() = 6; But we need 54321 to get ---> yadnuS
			for (i = start with 5 (length6 - 1 = 5))
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		String day = "Sunday";
		
		System.out.println(day.charAt(5));
		
		for(int  i=day.length()-1; i>=0 ;i--) {       // When asking the length it shows 6, Sunday = 6, 
			System.out.print(day.charAt(i));
		}
		
		
		
		 //Create a String and if the String is not empty perform the following:
	    //if the String has an odd number of characters and has 3 or more characters,
	    //print the character in the middle of the String.
		
		String str1 = "Hello";
		if(!str1.isEmpty()) {
			if(str1.length()%2!=0) {
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
