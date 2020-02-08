package com.class29;

public class VehicleTest {
	
	public static void main(String[] args) {
		BMW bmw = new BMW("745i", "Sedan", "BMW", "X5");
		BMW.displayTotal();
		BMW bmw1 = new BMW("M4", "Coupe", "BMW", "M3");
		BMW.displayTotal();
		Car bmw2 = new BMW("M3", "Sedan", "BMW", "M2");
		BMW.displayTotal();
		//comes from Vehicle Class
		
		bmw.drive();
		bmw.speed();
		bmw.start();
		bmw.stop();
		
		//Comes
		bmw.breaking();
		
	}

}
