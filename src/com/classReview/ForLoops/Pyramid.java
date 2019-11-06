package com.classReview.ForLoops;

public class Pyramid {
public static void main(String[] args) {
	

	
	
	for (int row = 1; row <= 5; row++) {
	//	System.out.println(row);
	for (int col = 1; col <= row; col++ ) {
		System.out.print(col);
	}
		System.out.println();
	}
	
	
	for (int i = 1; i <=5; i++) {
	
		for (int j = 5-i ; j >= 1; j--) {
			System.out.print(" ");
		}
		for (int k = 1; k <= i; k++) {
			System.out.print(k);
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
}
	
	
}
