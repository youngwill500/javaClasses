package com.class13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your class day:: ");
		String day = scan.nextLine();
		
		if(day.equals("saturday")) {
			System.out.println("Saturday is your Java Class");
		}else if(day.equalsIgnoreCase("sunday")) {                  //We added equals"IgnoreCase", So that if user inputs it in Cap or Low case it still accepts it 
			System.out.println("Sunday is your Git Class");
		}else if (day.toUpperCase().equals("TUESDAY")) {            //We added "toUpperCase().equals because "TUESDAY" is in caps, if user inputs in lower case it still accepts it 
			System.out.println("Tuesday is your SDLC Class");
		}else if (day.equals("thursday")) {
			System.out.println("Thursday is your manual testing class");
		}else { 
			System.err.println("Invalid Entry! You entered the wrong day");
		}
		scan.close();
		
		
		
		
		
		

	}

}
