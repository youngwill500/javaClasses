package com.class29;

public class PhoneTest {

	public static void main(String[] args) {
		
		//You cannot create an object of an abstract class
		// Phone phone = new Phone();  CE: cannot instance
		
		
		//We can create it indirectly, by referencing the subclass
		
		Phone obj = new iPhone(); 
		
		obj.makeCall();
		obj.sendText();
		obj.takePictures();
		obj.playGames();
		
		

	}

}
