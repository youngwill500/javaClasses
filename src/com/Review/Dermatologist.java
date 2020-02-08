package com.Review;

public class Dermatologist extends Doctor {

	
	public Dermatologist (String name, String specialty, int licenceId) {
		
		this.name = name;
		this.specialty = specialty;
		this.licenceId = licenceId;
		
	}
	
	
	
	
	public void chargePatient() {
		System.out.println("Gets $250.");
	}
	
	public void checkSkin() {
		
		
	}
	
}
