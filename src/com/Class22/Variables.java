package com.Class22;

public class Variables {

	//Local 
	// Variables declared inside the class and inside the method. The scope of the variable is only within that method.
	
	public static void main(String[] args) {
	//I want to access variable myName from different method	
	Variables obj = new Variables(); //Creating the object
	obj.sayName();					//Calling the variable
	
	System.out.println("*************************************");
	
	
		
		
		
		
		
		
	}
	
	
	void sayName() {
		String myName = "John";
		System.out.println(myName);
	}
	
	String createEmail(String name, String lastName, String email) {
		String userEmail = name+lastName+"@"+email+".com";
		return userEmail;
	}
	
	
}
