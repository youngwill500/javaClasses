package com.class21;

public class School {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		
		//.studentName/.GPA/.school is an instance variable // *Instance variables is a variable declared inside the class but outside the body of the method, 
		//constructors or any block. They are used by objects to store their states.
		student1.studentName = "Eric"; //Assigning the variables of the object i created
		student1.GPA = 3.95; 
		student1.school = "Syntax";
	
		
		Student student2 = new Student();
		
		
		student2.studentName = "Jamie"; 
		student2.GPA = 3.90; 
		student1.school = "Syntax";
		
		student1.displayInfo();
		student2.displayInfo();
		
		student1.study(3);
		student2.study(4);
		
		
		
		
		
		
	}

}
