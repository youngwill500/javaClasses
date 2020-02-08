package com.class25;

public class CalculateArea {
	
	public void area (int a, int b) {
		System.out.println("Area of rectangle is "+(a*b));
	}
	
	public void area(int a) {
		System.out.println("Area of square is "+(a*a));
	}

	public void area(int a, int b, int c) {
		System.out.println("Area of a box is "+(a*b*c));
	}
	
	
	
	public static void main(String[] args) {
		CalculateArea obj = new CalculateArea();
		obj.area(10,5);
		obj.area(5);
		obj.area(10, 12, 13);
		
	}
}
