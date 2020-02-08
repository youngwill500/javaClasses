package com.class17;

public class Computer {

	// define features, attributes
	String brand, name;
	boolean keyboard;
	int screen, memory, roll_no;

	// define behavior, actions
	void powerOn() { // method header
		// method body
		System.out.println("Computer " + brand + " " + name + " " + "is now on :)");
	}

	void Search() {
		System.out.println("You are now searching for stuff on your " + brand + " " + name);
	}


////////////////////////////////////////////////////////////////////////////
public static void main(String[] args) {
	
	
	Computer cpu1 = new Computer();		//Creating object of the computer class
										//Adding more details/features to the object
	cpu1.brand="Apple";
	cpu1.name="Macbook";
	cpu1.memory=250;
	
	System.out.println("I have an "+cpu1.brand+" "+cpu1.name);
									//We're calling the method from the set of methods defined above
	cpu1.powerOn();
	cpu1.Search();
	
	
	
}
}