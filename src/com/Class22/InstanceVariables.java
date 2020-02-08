package com.Class22;

public class InstanceVariables {
	
	// Instance Variables Variables declared inside the class BUT outside the main method
	// When we create an Instance of the class (object of the class) copy of each instance variable will be given to each object (instance).
	
	
	
	
	
	String name = "Samir"; //Inside the class but outside of the main method
	

	public static void main(String[] args) {
		
		String name = "Burcu";
		System.out.println(name);
		
		//Changing the value of the instance variable
		InstanceVariables obj = new InstanceVariables();
		obj.name = "John";
		System.out.println(obj.name);
		
		// Value will be Samir 
		InstanceVariables obj1 = new InstanceVariables();
		System.out.println(obj1.name);
		
		
		
		
	
		

	}

}
