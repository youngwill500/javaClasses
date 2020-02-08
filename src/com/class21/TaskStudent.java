package com.class21;

public class TaskStudent {
	
	public String studentName;
	public int studentID;
	public static int numberOfStudents;
	
	

	public static void main(String[] args) {
		
		TaskStudent s1 = new TaskStudent();
		s1.studentName = "Ali";
		s1.studentID = 345;
		TaskStudent.numberOfStudents++;
		
		TaskStudent s2 = new TaskStudent();
		s2.studentName = "Seval";
		s2.studentID = 456;
		TaskStudent.numberOfStudents++;
		
		TaskStudent s3 = new TaskStudent();
		s3.studentName = "Sam";
		s3.studentID = 567;
		TaskStudent.numberOfStudents++;
		
		
		System.out.println("The total number of students "+ TaskStudent.numberOfStudents);
		
		
	}

}
