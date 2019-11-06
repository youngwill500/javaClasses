package com.class6;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 7 weekdays
		 * if day==1 --> Monday
		 * 
		 * 
		 */

		int Day = 1;
		String weekDay;
		
		
		if (Day == 1) {
			weekDay = "Monday";
		} else if (Day==2) {
			weekDay = "Tuesday";
		}else if (Day==3) {
			weekDay = "Wednesday";
		}else if (Day==4) {
			weekDay = "Thursday";
		}else if (Day==5) {
		    weekDay = "Friday";
		} else if (Day==6) {
			weekDay = "Saturday";
		}else if (Day==7) {
			weekDay = "Sunday";
		} else {
			weekDay = "Invalid";
		}
		 System.out.println(weekDay);
		 
		 
		 /////////////////////////////////////
		 
		 int day = 3;
		 
		 switch (day) {
		 case 1: 
			 weekDay = "Monday";
			 break;
		 case 2:
			 weekDay = "Tuesday";
			 break;
		 case 3:
			 weekDay = "Wednesday";
			 break;
		 case 4:
			 weekDay = "Thursday";
			 
		 }
			 
		 System.out.println(weekDay);
		 
		 /////////////////////////////////
		 
		 Scanner scan = new Scanner (System.in);
		 System.out.println("Please enter your gender: F or M");
		 char Gender = scan.next().charAt(0);
		 String userGender;
		 
		 switch (Gender) {
		 case 'F':
			 userGender = "Female";
			 break;
			 
		 case 'M':
			 userGender = "Male";
			 break;
			 
		default:
			userGender="Unknown";
		 }
		
		 System.out.println("your gender is " +userGender);
		 
		 
		 
		 
		
	}

}
