package com.AlexLee;

public class ForLoops {

	public static void main(String[] args) {
		//When you know exactly how many times you want to loop through 
		// a block of code, use the for loop instead of a while loop:
		
		
		
		
		for (int i = 1; i <= 10; i++) {   // This loop is going to run 10 times, the middle determines how
			System.out.println(i);       // many times its going to run.
		}
									   
			System.out.println("*******************"); 
		
		int	k = 0;
			
		for (int j = 10; j>k; j--) {    // This loop is going to run 10 times, it's going to count down from 10 - 1.
			System.out.println(j);
		}
		
		
			System.out.println("*********************");
		
		int M = 20;
		
		for (int L = 0; L<M; L++) {    // This loop is going to run 20 times, but it's only going to print the even numbers. 
			if (L%2==0) {
				System.out.println(L);
			}
		}
		
		System.out.println("*************************");
		int Y = 0;
		
		for (int X = 20; X>Y; X--) {  // This loop is going to run 20 times, but it's only going to print the Odd numbers. 
			if (X%2!=0) {
				System.out.println(X);  
			}
		}
		
		
		System.out.println("*************************");
		
		int Start = 50;
		
		for (int z = 5 ; z <= Start; z++) { // This loops begins at 5 and ends at 50. 
			System.out.println(z);
		}
		
		
		System.out.println("*************************");
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
