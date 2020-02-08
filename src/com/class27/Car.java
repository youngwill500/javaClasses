package com.class27;

public class Car {

	String make, model;

	Car() {

		System.out.println("I am a non argument constructor");
	}

	Car(String make, String model) {
		this.make = make;
		this.model = model;

	}

}

class Tesla extends Car {
boolean autopilot;
Tesla() {
		super();
		System.out.println("I am a child non argument constructor");
	}

	Tesla(String make, String model,boolean autopilot) {
		super(make,  model); //We are calling super with two varaibles because in the parent class we are asking for two 
		this.autopilot = autopilot;
	}

	public void displayInfo() {
		System.out.println("Car " + make + " " + model + " has an autopilot " + autopilot);
	}
}