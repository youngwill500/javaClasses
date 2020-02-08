package com.Class22;

// Static declared inside the class but outside any method, constructor // This is used for common features and will be shared amongst all objects
// Static is a keyword
// 


public class StaticVariables {
	
	//instance variables
	String name;
	String lastName;
	
	//static variable
	static int eyes = 2;
	static int nose=1;
	static boolean brain = true;
	
	

	public static void main(String[] args) {
	
		StaticVariables human1 = new StaticVariables();
		human1.name = "John";
		human1.lastName = "Smith";
		
		System.out.println(StaticVariables.eyes);   //This lives within the class and not within the instance
		System.out.println(human1.nose);
		
		
		Human human2 = new Human();
		human2.name = "Jimmy";
		human2.lastName = "Miller";
		human2.lastName = "Doe";
		
		
		
		
	
		
		
	}

}
