package com.class24;

public class Car {
	

	public String make, model, type, country;  //Declaring Instance Variables
	public int horsepower, doors;				//Declaring Instance Variables
	
	public static String racecar = "Le Mans Race Car"; //
	
	
	Car(String carMake, String carModel, String carType,String carCountry, int carHP, int carDoors) { //created a constructor class with 6 parameters
		
		make = carMake;					//Renaming parameter variables
		model = carModel;
		type = carType;
		country = carCountry;
		horsepower = carHP;
		doors = carDoors;
		
	}
	
	public void leMans() { //create a m
		
		System.out.println("We drive a "+make+" "+model+" and it's a "+type+" from "+country+" it has "+horsepower+" with "+doors+" doors "+"and won LeMans and its"
				+ " a "+racecar);
		
	}
	
	
	
	
	public static void main(String[] cars) {
		
		Car car1 = new Car("Ford", "MK2", "Grand Touring","USA",560, 2);
		car1.leMans();
		
		Car car2 = new Car("Ferrari","P4","Grand Touring","Italy",556,2);
		car2.leMans();
		
		
		
		
		
		
		
	}
	

}
