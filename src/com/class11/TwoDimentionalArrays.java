package com.class11;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
		
		//Declare 2D Array
		
		int [][] array = new int [3] [4];
		
		//1st Row
		
		array [0][0] = 44;
		array [0][1] = 80;
		array [0][2] = 33;
		array [0][3] = 20;
		
		//2nd Row
		
		array [1][0] = 10;
		array [1][1] = 5;
		array [1][2] = 7;
		array [1][3] = 8;
		
		//3rd Row
		
		array [2][0] = 10;
		array [2][1] = 9;
		array [2][2] = 70;
		array [2][3] = 8;
		
		System.out.println(array[1][3]);
		
		System.out.println("***********");
		
		//Task: Create a 2D array of String with 2 and 3 columns.
		
		int [][] array1 = new int [2][3];
		
		//1st Row
		
		array1 [0][0] = 1;
		array1 [0][1] = 2;
		array1 [0][2] = 3;
		
		//2nd Row
		
		array1 [1][0] =4;
		array1 [1][1] =5;
		array1 [1][2] =6;
		
		System.out.println(array1[1][2]);
		
		System.out.println("***********");
		
		int [] [] numbers = {
				{8,7,5,3,8},
				{1,5,6,4,9},
				{3,6,8,0,7}
		};
		
		System.out.println(numbers[1][4]);
		
		//To identify the numbers of Rows
		System.out.println(numbers.length);
		
		//To identify the numbers of Rows/elements in that row
		System.out.println(numbers[1].length);
				
		System.out.println("***********");	
		
		for(int i =0; i< numbers.length; i++) {
			for(int j=0; j< numbers[0].length;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
