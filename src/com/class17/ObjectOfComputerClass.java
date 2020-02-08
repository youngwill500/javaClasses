package com.class17;

public class ObjectOfComputerClass {

	public static void main(String[] args) {
	
		Computer cp1 = new Computer();
		
		cp1.brand = "Apple";
		cp1.name = "Macbook";
		cp1.keyboard = true;
		cp1.screen = 15;
		cp1.memory = 250;
		
		
		System.out.println("I just bought a "+cp1.brand+" "+cp1.name+" "+"for the low");
		
		cp1.powerOn();

	}

}
