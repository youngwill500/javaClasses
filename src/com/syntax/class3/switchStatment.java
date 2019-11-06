package com.syntax.class3;

import java.util.Scanner;

public class switchStatment {

	public static void main(String[] args) {
	
		 Scanner scan = new Scanner(System.in);
		 
		  String country;
		  String foodName;

		  System.out.println("Please enter your country");
		  country = scan.nextLine();
		  
		  switch (country) {
		  case "Turkey":
		  foodName = "kebab";
		  break;
		  case "Ethiopia":
		  foodName = "Tibs";
		  break;
		  case "Morocco":
		  foodName = "Tajin";
		  break;
		  case "Kazakhstan":
		  foodName = "Kumis";
		  break;
		  case "Pakistan":
		  foodName = "Beryani";
		  break;
		  case "Russia":
		  foodName = "Caviar";
		  break;
		  case "Cuba":
		  foodName = "Sofrito";
		  break;
		  default:
		  foodName = "Unknown";
		  }
		  System.out.println("You are from "+country+" and your favorite food is "+foodName);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
