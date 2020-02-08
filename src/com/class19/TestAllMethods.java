package com.class19;

public class TestAllMethods {

	public static void main(String[] args) {
	
		
		//find the larget from 300 and 500
		//then identify is the largest number is
		
		//Do "AllMethods" Class 
		
		AllMethods obj = new AllMethods();
		
		
		
		//call method weekDayName
		// if(tuesday, wednesday, thursday, saturday, sunday ---> I'm learning java
		
		String day = obj.weekDayName(5); //Calling the method and argument, anything after = is considered an argument
		
		if (day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("We have Java Class");
		}else { 
			System.out.println("We don't have Java Class");		
		}
		
		
		
		
		String eMail = obj.createEmail("Kenwill", "Roberts", "@Gmail.com");
		System.out.println(eMail);
		
		
		
		
		
		
		
		
		
		
		
		
		Student task1 = new Student();
		
		char grade = task1.getGrade(95);
		System.out.println(grade);
		
	
	
		
		
		

	}

}
