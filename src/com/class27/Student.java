package com.class27;

public class Student {

	void study() {
		System.out.println(" I study alot");
	}

}
	class SyntaxStudent extends Student {

		public void study() {
			System.out.println("I study alot while in this bootcamp");
		}

	}
	
	
	class CollegeStudent extends SyntaxStudent {
		
		public void study() {
			System.out.println("I study while I party");
		}
		
	}
