package com.class23;

public class BetterCar {

	public static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	
	
	BetterCar(String carModel, String carColor, int carSpeed, int carDoors) {
		
		model =  carModel;
		color =  carColor;
		speed =	 carSpeed;
		doors = carDoors;	
	}
	
	public static void main(String[] args) {
		make = "BMW";
		BetterCar bcar2 = new BetterCar("M4","Silver",187,2);
		bcar2.getDetails();
		
	}
	
	
	
	
	
	
	public void getDetails() {
		
		System.out.println("I built "+color+" "+make+" "+model);
		System.out.println("My car has "+doors+" have speed up to "+speed);
	}
	
	
}
