package com.class6;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What month were you born in?");
		String month = scan.next();
		
		String season = "";
		
		if (month.equals("Jan") || month.equals("Feb") || month.equals("Dec")) {
			season = "Winter";
		} else if (month.equals("Mar") || month.equals("Apr") || month.equals("Jun")) {
			System.out.println("It's Spring");
		}else if (month.equals("Jul") || month.equals("Aug") || month.equals("Sep"))  {
			System.out.println("It's Summer");
		}else if (month.equals("Oct") || month.equals("Nov")) {
			System.out.println("It's Fall");
		}else {
			System.out.println("Invalid");
		}
		
		System.out.println("You were born in "+ season);
        
	}

}
