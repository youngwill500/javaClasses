package com.class33;

public class EncapsulationDemo {

	private String empName;
	private int empAge;

	// Getters

	public String getName() {
		return empName;
	}

	public int getAge() {
		return empAge;
	}

	// Setters

	public void setName(String empName) {
		this.empName = empName;
	}

	public void setAge(int empAge) {
		this.empAge = empAge;
	}

	public void display() {
		
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Age : "+empAge);
	}
	
}
