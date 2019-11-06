package com.AlexLee;

public class NestedForLoops {

	public static void main(String[] args) {
		
		
		for ( int i =9; i >=0; i--) {      /// This loop creates a Column    "Outer Loop"
			for(int k =9; k >= 0; k--) {  /// This loop creates a ROW        "Inner Loop"
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		
		/*
		 *  9 8 7 6 5 4 3 2 1 0          
         *  9 8 7 6 5 4 3 2 1 0 
         *  9 8 7 6 5 4 3 2 1 0 
         *  9 8 7 6 5 4 3 2 1 0 
		 *	9 8 7 6 5 4 3 2 1 0 
		 *	9 8 7 6 5 4 3 2 1 0 
		 *	9 8 7 6 5 4 3 2 1 0 
		 *	9 8 7 6 5 4 3 2 1 0 
		 *	9 8 7 6 5 4 3 2 1 0 
		 *	9 8 7 6 5 4 3 2 1 0 
		 * 
		 */
		
System.out.println("*******************");		
		

for (int a = 3; a>0; a--) {
	for (int b = a; b>0; b--) {
		System.out.print("*");
	}
	System.out.println();
}
		
		
for (int z = 0; z<3; z++) {
	for (int x = 0; x<=z; x++) {
		System.out.print("*");
	}
	System.out.println();
}
		
System.out.println("*********************");		
		
		
		
		
		
	}

}
