package com.class17;

public class ObjectOfPhone {

	public static void main(String[] args) {
		
		Phone ph1 = new Phone();
		
		ph1.Name = "Apple";
		ph1.Model = "iPhone";
		ph1.inService= true;
		ph1.storage = 16;
		
		ph1.makeCall();
		
		System.out.println("I use my "+ph1.Name+" "+ph1.Model);
		
		
		Phone ph2 = new Phone();
		
		ph2.Name = "Android";
		ph2.Model = "HTC";
		ph2.inService = false;
		ph2.storage = 250;
		
		System.out.println("I use my "+ph2.Name+" "+ph2.Model);
		
		
		
		
		
		
		
		
		
	}

}
