package com.class33;

public abstract class Insurance {

	String insuranceName;

	Insurance(String insuranceName) {
		this.insuranceName = insuranceName;

	}

	public abstract void getQuote();

	public abstract void cancelInsurance();

}

class Car extends Insurance {

	String carModel;

	Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel = carModel;
	}

	@Override
	public void getQuote() {
		System.out.println("Your insurance provider is " + insuranceName + " and you drive a " + carModel);

	}

	@Override
	public void cancelInsurance() {
		System.out.println("You would like to cancel " + insuranceName + " for your " + carModel);

	}

}

class Pet extends Insurance {
	String petType;

	Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType = petType;
	}

	@Override
	public void getQuote() {
		System.out.println("Your insurance provider is " + insuranceName + " and you own a " + petType);

	}

	@Override
	public void cancelInsurance() {
		System.out.println("You would like to cancel " + insuranceName + " for your " + petType);

	}

}

class Health extends Insurance {

	Health(String insuranceName) {
		super(insuranceName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getQuote() {
		System.out.println("Your insurance provider is " + insuranceName);

	}

	@Override
	public void cancelInsurance() {
		System.out.println("You would like to cancel " + insuranceName);

	}

}
