package com.class23;

public class CarTest {

	public static void main(String[] args) {
		
		Car.make = "Toyota";
		
		
		Car car1 = new Car(); 
		// Car -ClassName // car1 - object reference variable // = assigning operator // new - keyword used to create an object // Car() constructor// ; - end statement
		// Constructor - special method/ block of code that is being executed when we create an Object/ an Instance of the class
		
//		car1.model = "Camry";
//		car1.color = "pink";
//		car1.speed = 200;
//		car1.doors = 4;
//		car1.getDetails();
//		
//		Car car2 = new Car();
//		car2.model = "Corollay";
//		car2.color = "Blue";
//		car2.speed = 150;
//		car2.doors = 2;
//		car2.getDetails();
//		
		
		BetterCar bettercar1 = new BetterCar("Toyota", "White",180,5);
		BetterCar bettercar2 = new BetterCar("BMW", "White",200,2);
		
		bettercar1.getDetails();
		bettercar2.getDetails();
	}

}
