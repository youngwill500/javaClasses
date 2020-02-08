package com.class29;

public abstract class Phone { //Inside an abstract class we can have implemented and unimplemented methods. 
	// abstract keyword comes after access modifier and before class keyword.
	
	//every method that has a body we call an implemented method
	
	public void makeCall(){
		System.out.println("Make call");
	}
	
	public void sendText(){
		System.out.println("Make a text");
	}
	
	// every method that has NO body is unimplemented methods
	public abstract void takePictures();
	
	public abstract void playGames();
	
	
	
	

}
