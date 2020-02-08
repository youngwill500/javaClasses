package com.class33;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

class Student {

	String name;
	int studentId;

	public Student(String name, int studentId) {
		this.name = name;
		this.studentId=studentId;
	}

	public void display() {
		System.out.println("My name is "+name+" and my studend id is "+studentId);
	}
	
}

public class StudentTest {

	public static void main(String[] args) {
		//create an array list that will store student type of objects
		List<Student>students = new ArrayList<>();
		
		//creating student objects 
		Student stu = new Student("John", 101);
		Student stu1 = new Student("Jane", 102);
		Student stu2 = new Student("Jack",103);
		
		students.add(stu);
		students.add(stu1);
		students.add(stu2);
		
		//display info of each student
		
		stu.display();
		stu1.display();
		
		//for each // because what if we want display alot of students?
		
		for(Student student:students) {
			student.display();
		}
		
		//adding more objects of a Student Type// Adding more students 
		
		students.add(new Student("Mike",104));
		students.add(new Student("Jason",105));
		students.add(new Student("Ryan",106));
		
		//display info of each student
		
		Iterator<Student> myIterator = students.iterator();
		while(myIterator.hasNext()) {
			myIterator.next().display();
		}
		
		

	}

}
