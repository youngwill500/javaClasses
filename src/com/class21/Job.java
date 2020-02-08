package com.class21;

public class Job {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empolyee emp1 = new Empolyee();
		
		emp1.eID = 5001;
		emp1.Salary = 95000;
		Empolyee.CEO = "Sumair";
		
		Empolyee emp2 = new Empolyee();
		
		emp2.eID = 5002;
		emp2.Salary = 95000;
		Empolyee.CEO = "Sumair";
		
		emp1.EmployeeDetails();
		emp2.EmployeeDetails();
	}

}
