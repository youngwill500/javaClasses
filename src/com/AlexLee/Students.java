package com.AlexLee;

public class Students {

	
//	Write a java program of Class Students that takes students name and 3 subject grades.
//	Inside your class also have a method to Calculate Average Grade. 
//	Test Student class for 5 different students with different marks. 
//	Your program should print an average mark of each students name.
//	NOTE: please use different names for instance and local variables.

	
	public String studentName;
	public int grade1;
	public int grade2;
	public int grade3;
	
	 Students(String name, int gr1, int gr2, int gr3) {
		
		studentName = name;
		grade1 = gr1;
		grade2 = gr2;
		grade3 = gr3;
	
	}
	
	
	public void Average() {
		int average = (grade1+grade2+grade3)/3;
		System.out.println("The average of "+studentName+" grades are "+average);
	}
	
	
	
	
	public static void man(String[] args) {
		child1.Average();
	}
	
	
	
	
	
	
	
}
