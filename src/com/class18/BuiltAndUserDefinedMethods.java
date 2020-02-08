package com.class18;

import java.util.Scanner;

public class BuiltAndUserDefinedMethods {

	public static void main(String[] args) {

		// This is a built in method, this comes with our java package
		String str = "Hello";
		str = str.replace("Hello", "Hi");
		System.out.println(str);

		Scanner scan = new Scanner(System.in);
		String scannerString = scan.nextLine();
		System.out.println(scannerString);

		
		
		
		
		BuiltAndUserDefinedMethods obj = new BuiltAndUserDefinedMethods();
		obj.myMethod(); // calling my method

	}

	void myMethod() { //Method Header
		System.out.println("This is my defined method");	//Method Body
	}

}
