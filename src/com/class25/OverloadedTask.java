package com.class25;

public class OverloadedTask {

	// Create 1 class with a static method that has 3 overloaded forms.
	// Then call each overloaded method with specific arguments and observe result.
	
	
	
	
	static void Task1(int a) {
		System.out.println('A');
	}
	
	static void Task1(int a, int b) {
		System.out.println(a+b);
	}
	
	static void Task1(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		
		OverloadedTask mm = new OverloadedTask();
		
		mm.Task1('a');
		
		mm.Task1(5, 10);
		
		mm.Task1(5, 7, 10);
		
		
	}
}
