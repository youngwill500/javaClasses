package com.class2;

public class ArithmeticOperations {
/*
 * declare 2 variables and initialize them
 * perform addition, subtraction, multiplication and division 
 */
	
	public static void main(String[] args) {

		int num1, num2;
		
		num1=20;
		num2=10;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		//How can we print value of num1 and num2 together
		
		System.out.println(num1+""+num2);
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		//the addition of 2 numbers is _ 
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		
		System.out.println("The addition of 2 numbers is "+ sum);
		System.out.println("The subtraction of 2 numbers is "+ sub);
		System.out.println("The multiplication of 2 numbers is "+ mult);
		System.out.println("The multiplication of 2 numbers is "+ div);
		
		//Write a Java program to add, subtract, multiply and divide 2 decimal values. 
		//Your program should say. “The _______ of 2 numbers ___ and ___ is equal to _____”
		
		
		double num7=3.9;
		double num8=1.9748417658131;
				
		System.out.println("The square of the " + num7 +" is "+ num8);
	
			int width=5;
			int height=8;
			
			int area=width*height;
			int perimeter=2*(width+height);
			
			//*The perimeter of a rectangle with weidth___ and height ____ is equal to ____ and the area is__'
			
			System.out.println("The preimiter of rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is "+area);
			
			
	}
		
}
