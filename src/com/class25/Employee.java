package com.class25;

public class Employee {

	
	public static String companyName;
	int salary;
	protected int employeeId;
	private String employeeSsn;
	
	
	
	void work () {
		System.out.println("I work at "+companyName);
	}
	
	void getPaid() {
		System.out.println("I get paid "+salary);
	}
	
	
	
}
