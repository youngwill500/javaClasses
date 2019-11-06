package com.syntax.class3;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {

		

		
		
int num =2;

	if (num%2==0) {
	System.out.println("The number is even");	
	} else {
		System.out.println("The number is odd");
	}
		
		
//////////////////////////////////////////////////////////
	
	
	int x, y, z;
	
	System.out.println("Enter three numbers");
	
	Scanner scan = new Scanner (System.in);
	
	x = scan.nextInt();
	y = scan.nextInt();
	z = scan.nextInt();
	
	 if (x > y && x > z)
	      System.out.println("Largest Number ");
	    else if (y > x && y > z)
	      System.out.println("Second number is largest.");
	    else if (z > x && z > y)
	      System.out.println("Third number is largest.");
	    else
	      System.out.println("The numbers are not distinct.");
		
		
		
		
		
		
		
		
		
		
		

	}

}
