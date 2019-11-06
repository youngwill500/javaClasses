package com.class14;

import java.util.Scanner;

public class GroupTask {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Problem #1: How to swap two numbers without using a temporary variable?  
		
		
		int x = 10;
		int y = 5; 
		
		x = x+y; // This is X = 15
		y = x-y; // This is X=15 - Y=5 = (10)
		x = x-y; // X=15 - Y=10 = (5)
		
		System.out.println(x);
		System.out.println(y);
		
		String [][] fancyColors = { {"Blue","yellow","Orange"},
									{"Yellow","White","Pink"}
	};
		
		
String sen = " What if it can turn out better than you can imagine? ";

String newSen = sen.trim().toUpperCase();

System.out.println(newSen.substring(5, 14));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
