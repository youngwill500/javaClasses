package com.class24;


// Write a program  that will have a 4 different access levels of constructors and create 3 objects of this class:
// 1 - inside same class; 2 - from outside the class and observe result. 3 - from different class inside different package






public class Task1 {
	
	private Task1(int num, int num1) {
		System.out.println("This is a private constructor");
	}
	
	public Task1(String s) {
		System.out.println("This is a public constructor");
	}
	
	Task1(int num) {
		System.out.println("This is a defualt constructor");
	}
	
	protected Task1(char a) {
		System.out.println("This is a protected consturctor");
	}
	
	
	public static void main(String[] args) {
		
		Task1 mm = new Task1(5,5);
		Task1 mm1 = new Task1("home");
		Task1 mm2 = new Task1(5);
		Task1 mm3 = new Task1('A');
		Task11 mm = new Task11();
		
	}

}
