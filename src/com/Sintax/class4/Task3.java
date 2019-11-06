package com.Sintax.class4;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
			//Prompt the user to ask the name 3 times and print "Hello____" 
			
int i = 0;
String name = null;


while(i!=3) {
	System.out.println("What's your name?");
 name = scan.nextLine();
	i++;	
} System.out.println("Hello "+name);
			
		
		
		
		
		
		
		
		
		
		
		

	}

}
