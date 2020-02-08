package com.Class22;

public class StaticVsNonStatic {

	//template for students (school, name, grade)
	
	static String school = "Syntax";
	String name;
	char grade;
	
	//instance method, non static 
	
	void getInfor() {
		System.out.println("My name is "+name+" and I am going to "+ school + " and my name is "+grade);
	}
	
	//static method
	static void getinfo1() {
		System.out.println("I am attending classes at "+school);
	}
	
	
	public static void main(String[] args) {
		
		//Accessing static members within same class, just use name for a variable or call method by its name only
		
	}
	
	
}
