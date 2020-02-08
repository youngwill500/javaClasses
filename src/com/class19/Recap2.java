package com.class19;

public class Recap2 {

	
	 // Recap2 Large = new Recap2();
	
	 // int Largest = Large.findLargest(5, 7);
	
	int findLargest (int num1, int num2) {
		int largest;
		
		if(num1 > num2) {
			largest = num1;
		}else {
			largest = num2;
		}
		return largest;
	}
	
	
	public static void main(String[] args) {
		
	Recap2 Large = new Recap2();
		
	int Largest = Large.findLargest(5, 7);
		
	System.out.println(Largest);
		
		
		
		
		
	}

}
