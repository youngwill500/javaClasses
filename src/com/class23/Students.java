package com.class23;

public class Students {
	
//	Write a java program of Class Students that takes students name and 3 subject grades.
//	Inside your class also have a method to Calculate Average Grade. 
//	Test Student class for 5 different students with different marks. 
//	Your program should print an average mark of each students name.
//	NOTE: please use different names for instance and local variables.
//	
	
	String name;
	
	int grade1, grade2, grade3;
	
	Students (String studentName, int gr1, int gr2, int gr3) {
		
		name = studentName;
		grade1 = gr1;
		grade2 = gr2;
		grade3 = gr3;
		
	}
	
	public static void main(String[] args) {
		
		Students student1 = new Students("John",90,78,100);
		student1.calculateAverage();
	}
	
	
	
	
	public void calculateAverage() {
		int average =(grade1+grade2+grade3)/3;
		System.out.println("Student name is "+name+" and his average is "+average);
	}
	
	
	
	
	
	

}
