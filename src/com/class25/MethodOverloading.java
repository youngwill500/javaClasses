package com.class25;

// Polymorphism
// 2 types of Polymorphism:

// Complile Time Polymorphisim also known as Static Binding/Early Binding - method overloading

//Method overloading is having same method name within SAME calss by having different number of parameters





public class MethodOverloading {
	
	//method overloading{
	//1 by passing different of parameters
	
	public void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public void add(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	
	//1 by having different types of parameters
	public void add(double num1, double num2) {
		System.out.println(num1+num2);
	}
	
	public void add(int num1, double num2) {
	System.out.println(num1+num2);
	}
	
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.add(12, 13);
		obj.add(12, 13, 14);
		
	}

}
