package com.class5;

public class LogicalOr {

	public static void main(String[] args) {

		// 7 days a week
		// if day is 2 or 4 ---> SDLC class
		// if day 6 or 7 ---> Java Class
		// if day 1 or 5 ---> No Class
		// if day =3 --> review class

		// || = Or, only one has to be true

		int day = 6;

		if (day == 2 || day == 4) {
			System.out.println("SDLC Class");
		} else if (day == 6 || day == 7) {
			System.out.println("Java Class");
		} else if (day == 1 || day == 5) {
			System.out.println("No Class");
		} else {
			System.out.println("Not a valid day");
		}

		
		String weekDay="Sunday";
		
		if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
			System.out.println("SDLC Class");
		}else if(weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
			System.out.println("Java Class");
		}else if(weekDay.equals("Monday") || weekDay.equals("Friday")) {
		System.out.println("No Class");
	
		}
	
		
	}

}
