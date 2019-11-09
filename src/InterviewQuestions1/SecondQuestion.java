package InterviewQuestions1;

import java.util.Arrays;

public class SecondQuestion {

	public static void main(String[] args) {
		
		/*
		 *  Write a java program to find the second largest number in the array?
		 *  Maximum and minimum number in the array?
		 * 
		 */
		
		int[] array= {100, -90, 8787, 898, 0, 1};
		
		// 1 easiest way
		
		Arrays.sort(array);
		
		int min = array[0];
		int max = array[array.length-1];
		
		System.out.println(min);
		System.out.println(max);
	
		System.out.println("************************************************************");	
		
		//2nd way 
		
		int[] array1= {100, -90, 8787, 898, 0, 1};
		
		int largest = array1[0];
		int smallest = array1[0];
		
		for (int i=0; i < array1.length; i++) {      //I will start loooping from 1st postion until we reach the total 
			
			if (array1[i]>largest) {				//Each element in loop we will compare to the largest 
				largest = array1[i];
			}
			
			if(array1[i]<smallest) {			//Each element in loop we will compare to the smallest
				smallest = array1[i];
			}
			
		}
		
		System.out.println("The smallest value in the array is "+ smallest);
		System.out.println("The largest value in the array is "+ largest);
		
		
		
		System.out.println("************************************************************");	
		
		
		//Find the second largest number
		
		
		
		
		
		
		
		
		
		
		

	}

}
