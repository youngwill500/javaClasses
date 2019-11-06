package com.class11;

public class TwoDArrayDemo2 {

	public static void main(String[] args) {
		
		String [] [] names= {
				{"Khan", "Yousuf","Alex","Zynab"},
				{"MoHammad", "Ann", "Naslyhan", "Weqas"},
				{"Diago", "Asif", "Zubair", "Shogofa"},
				
		};
		
		
		int lengthOfRows=names.length;
		System.out.println(lengthOfRows);
		
		int lengthOfCols=names[0].length;
		System.out.println(lengthOfCols);
		
		for(String getArrays[]: names) {
			for(String getName: getArrays) {
				
				System.out.print(getName+" ");
				
			}
			System.out.println();
		}
		
		
		
		
	System.out.println("***********************");
		
		// Create a 2D array of integer type with 3 ROWS and 4 COLUMNS and print all values of the whole array.
	
	int numbers [] [] = {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			
	};
	
	
int sum = 0; // Place holder to find the addition	
//int LRows = numbers.length;
//int LCols = numbers[0].length;

for(int getRows[]:numbers) {
	for (int getCols:getRows) {
	//	System.out.print(getCols+" ");
		
		sum=sum+getCols;
		//System.out.println(sum);	
	}
	
	System.out.println(); 
		
}
		
 System.out.println(sum);		
 System.out.println("Hello World");		

 
 
 
 

	}

}
