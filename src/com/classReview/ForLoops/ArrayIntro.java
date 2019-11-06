package com.classReview.ForLoops;

import java.util.Scanner;

public class ArrayIntro {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to ender?");
		int size = scan.nextInt();
		
	
		
		int [] array = new int [size];
		
		for (int i = 0; i < size; i++) {
			array [i] = scan.nextInt();
		}
		
		
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += array[i];
		}
		System.out.println("The sum is "+ sum);
		

	}

}
