package reviewClass;

import java.util.Scanner;

public class Scanner2DayArry {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("How many Rows do you want?");  //Getting the amount of Rows
	int rows = scan.nextInt();
	
	System.out.println("How many Cols do you want?");  //Getting the amount of Cols
	int cols = scan.nextInt();
	
	String[][] names = new String [rows][cols];			// Creating the 2D Array Table
	
	for(int i = 0; i < rows; i++) {							//Creating the rows
		for(int j = 0; j < cols; j++) {						//Creating the cols
			System.out.println("Please enter a name!");		//Asking user to print the names multiple times
			names[i][j] = scan.next();
		}
	}
	
	for(int i = 0; i < rows; i++) {
		for(int j = 0; j < cols; j++) {
			System.out.print(names[i][j]+" ");
		}
		System.out.println();
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
