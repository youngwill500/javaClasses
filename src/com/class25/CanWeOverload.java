package com.class25;

public class CanWeOverload {
	
	//Can we overload a private method? - Yes
	
	private void methodOne() {
		System.out.println("I am method one");
	}
	
	private void methodOne(String str) {
		System.out.println("I am method one with "+str);
	}
	
	//can we overload a main method?
	public static void main(String[] args) {
		System.out.println("I am a main method");
	}
	
	public static void main(String str) {
		System.out.println("I am a main method with String arguments");
	}
	

}
