package com.class3;

public class temperatureCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temperature= 10;
		int temperature2= 32;
		
		if(temperature<temperature2) {
			System.out.println("Water will freeze with temperature "+temperature);
		}else {
			System.out.println("Water will not free with temperature "+ temperature);
		}
		
		
		boolean isRain=false;
		//if it is raining I will take umbrella, otherwise I go for a walk.
		
		if(isRain) {
			System.out.println("I will take umbrella");
		}else { 
			System.out.println("I go for a walk");
		}
		
	}

}
