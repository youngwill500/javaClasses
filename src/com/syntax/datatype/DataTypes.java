package com.syntax.datatype;

import java.util.Scanner;

public class DataTypes {
	
	/*
	 * You need to ask user to pay for coffee You need to keep asking user to pay
	 * for it until entered price is equal =5;
	 * 
	 * After user paid then say "Enjoy your coffee!"
	 * 
	 */	
	
	
public static void main(String[] args) {
	
	int num = 0;
	
	Scanner scan = new Scanner(System.in);
	
	
	do {
		System.out.println("Please pay for coffee");
		int price = scan.nextInt();
		num++;
	} while (num!=5);
		System.out.println("Enjoy your coffee");
	    
		
	
	
	
	
	

	
	
	
  }
}
