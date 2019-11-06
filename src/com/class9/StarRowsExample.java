package com.class9;

public class StarRowsExample {

	public static void main(String[] args) {
		
	for (int a=0; a<=10; a++) {                 //Rows
			for (int b =0; b<=10; b++) {          // Cols
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		/*
		 * 11111
		 * 22222
		 * 33333
		 * 44444
		 * 55555
		 * 66666
		 */
		
		
      /*
       * 123456789
       * 123456789
       * 123456789
       * 123456789
       * 123456789
       */
		
		
			
		/*
		 * 55555
		 * 44444
		 * 33333
		 * 22222
		 * 11111
		 * 
		 * 
		 */
		
		
		for (int a=5; a>0; a--) {  
			for (int b=5; b<a; b--) {  
				System.out.print(a);
				
			}
			System.out.println();
		}	
		
		
		
		
	}

}
