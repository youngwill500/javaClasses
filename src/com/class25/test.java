package com.class25;

public class test {

	public static void main(String[] args) {
		System.out.println("Creating an object of the employee class");
		
		Employee emp = new Employee();
		emp.salary = 70000;
		Employee.companyName ="Syntax";
		emp.work();
		emp.getPaid();
		
		System.out.println("Creating an object of the ScrumTeam class");
		
		ScrumTeam scrum = new ScrumTeam();
		scrum.salary = 90000;
		scrum.work();
		scrum.getPaid();
		scrum.artifacts = "Product Backlog, Sprint Backlog";
		scrum.ceremonies = "Sprint Demo, Planning";
		scrum.attendScrumMeetings();
		
	}
	
	
}
