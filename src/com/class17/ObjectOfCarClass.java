package com.class17;

public class ObjectOfCarClass {

	public static void main(String[] args) {

		// To create an object syntax is
		// ClassName variable = new ClassName();

		// Building the objects here

		Car car1 = new Car(); // Creates a new Object

		// These are being pulled from the Car class i created
		car1.make = "Tesla";
		car1.model = "Model 3";
		car1.color = "Black";
		car1.year = 2020;
		car1.wheels = 4;
		car1.windows = 5;

		car1.start();
		car1.drive();
		car1.accelerate();

		Car car2 = new Car(); // Creating a new object for car2

		car2.make = "BMW";
		car2.model = "M4";
		car2.color = "White";
		car2.year = 2016;

		// print features of the car
		// I have black Tesla

		System.out.println("I have a " + car1.color + " " + car1.make);

	}

}
