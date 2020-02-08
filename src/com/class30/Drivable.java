package com.class30;

public interface Drivable {
	// public static final variables will automatically be added
	boolean DRIVE_FAST = true; // Constant variables are written using upper case

	// by default compiler will add public abstract
	void drive();

}

class Cars {

	public void stop() {
		System.out.println("Car stops by pressing breaks");

	}
}

class Toyota extends Cars implements Drivable { // Multiple inheritance

	@Override
	public void drive() { // to avoid error we have to add the unimplemented method, like abstract
		System.out.println("Toyota can drive");

	}

}