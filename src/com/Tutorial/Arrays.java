package com.Tutorial;

public class Arrays {

public static void main(String[] args) {
	
	int[][] a = {
			{5,2,3,7},
			{1,5,1,1},
			{8,3,1,2}
		};
//should be 8

	int max = a[0][0];
	for( int row = 0; row < a.length; row++) {
		for(int col = 0; col < a[row].length; col++) {
			if (a[row][col] < max) {
				
				max = a[row][col];
			}
		
		}
		
	}
	System.out.println(max);
	
	
	
	
	
	
	
	
	
	
		
		

	}

}
