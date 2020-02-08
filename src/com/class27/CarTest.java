package com.class27;

public class CarTest {

	public static void main(String[] args) {
		
		Tesla tesla = new Tesla();
		Tesla tesla1 = new Tesla("Tesla XL","S8", true);
		tesla1.displayInfo();
		
		Tesla tesla2 = new Tesla("Tesla XR","S4",false);
		tesla2.displayInfo();

	}

}
