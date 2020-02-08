package com.class29;

public abstract class Vehicle {
	String vinNumber;
	static int totalVehicles;
	
	Vehicle(String vinNumber){
		this.vinNumber  = vinNumber;
		totalVehicles++;					
		
	}
	
	public void drive(){
		System.out.println("press gas");
	}
	
	public void stop(){
	 System.out.println("Press break");
	}
	
	public static void displayTotal() {
		System.out.println("Total vehicles we build="+totalVehicles);
	}
	
	public abstract  void start(); //We don't know which is why we are going abstract
	public abstract void speed(); //We don't know which is why are going abstract

}
