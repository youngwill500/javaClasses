package com.Class22;

public class TestStaticvsNonStatic {

	public static void main(String[] args) {
		
		
		/*
		 * how to access static members they can be access by className
		 * 
		 */

		System.out.println(StaticVsNonStatic.school);
		StaticVsNonStatic.getinfo1();
		
		/*
		 * 
		 * How to access non static members they can be accessed by creating an Object of that class
		 * 
		 */
		
		StaticVsNonStatic obj = new StaticVsNonStatic();
		obj.name = "Jon";
		obj.grade = 'A';
		obj.getClass();
		
		
		
		
		
		
	}

}
