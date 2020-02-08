package com.AlexLee;

public class CarTest {

	public static void main(String[] args) { //We need our main method to test 
		
		Car.make = "RollsRoyce"; //We initialized this variable so all future makes will be RR 
		
		
		
		Car dreamCars = new Car(); //
		
		dreamCars.model = "Wraith";
		dreamCars.color = "Black";
		dreamCars.year = 2020;
		dreamCars.Details();
		
		
		Car dreamCars1 = new Car();
		
		dreamCars1.model = "Ghost";
		dreamCars1.color = "Black";
		dreamCars1.Details();
		
		
	}

}
