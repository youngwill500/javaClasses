package com.classs20;

public class USA {
	
	// import com.class20.*; // " * " This imports all classes found in class20
	
	private String capitalCity = "Washington DC"; // Can only be accessed within the class
	public String mainState = "New York";		 // Can be accessed from within the same package
	protected String school = "Syntax";			// Can be accessed from within the same package
	

	    
	    public static void main(String[] args) {
	        USA us = new USA();
	        System.out.println("Access from inside USA class");
	        System.out.println(us.mainState);
	        System.out.println(us.school);
	        System.out.println(us.capitalCity);
	        
	    }
	
	
	
	
}
