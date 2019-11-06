package com.Practice;

import java.util.Scanner;

public class startingOver {

public static void main(String[] args) {
	
Scanner scan = new Scanner(System.in);
System.out.println("What city do you live in?");
String city = scan.next();

System.out.println("What's the current temperature?");
int temp = scan.nextInt();

int tempTotal=(temp- 32)*5/9;


System.out.println("The temperature in the city of "+city+" is " +tempTotal);








	
	
	

	
	
}

}
