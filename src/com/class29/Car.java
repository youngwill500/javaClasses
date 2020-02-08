package com.class29;

abstract class Car extends Vehicle {
	String carType;
	
	
	Car(String vinNumber, String carType) {
		super(vinNumber);
		this.vinNumber = vinNumber;
	}

	public void speed() {
		System.out.println("Max car speed up to 400");
	}

	public abstract void breaking(); // This is a new behavior, if we keep introducing new abstract methods we will
										// need to continue concrete them
	// in other classes

}

class BMW extends Car {

	String make, model;

	BMW(String vinNumber, String carType, String make, String model) {
		super(vinNumber, carType);
	

	}

	@Override
	public void start() {
		System.out.println("BMW starts remote");

	}

	@Override
	public void breaking() {
		System.out.println("BMW can break");

	}

	
	
}