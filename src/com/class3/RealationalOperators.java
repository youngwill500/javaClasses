package com.class3;

public class RealationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=20;
		int num2=19;
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		
		double d=1.99;
		double d1=2.99;
		
		boolean b1=d<d1;
		boolean b2=d==d1;
		boolean b3=d!=d1;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		int a=90;
		int b=300;
		//if number A is bigger than number b
		// I want to print A is large than b
		
		if (a>b) {
			System.out.println("a is larger than b");
		}else { 
			System.out.println("a is smaller than b");
		}
			
			int expectedHours=15;
			int actualHours=2;
			
			//if expected hours are more than actual > you will succeed otherwise, please study more
			
			if(actualHours>expectedHours) {
				System.out.println("you will succeed");
			}else {
				System.out.println("please study more");
			}
			
			
			double teaPrice=4.99;
			double allowedPrice=3.99;
			teaPrice-=2; //2.99=4.99-2
			
			//if price is more than I can afford I will NOT buy
			//if price is less or matches what I can afford then I will buy tea
			
			if (allowedPrice>=teaPrice) {
				System.out.println("I will buy tea");
				System.out.println("And I will enjoy my tea");
			}else {
				System.out.println("I cannon afford, I need to study more");
				
				
				
			}
			
		

	}

}
