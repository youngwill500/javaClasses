package InterviewQuestions1;

import java.util.Arrays;

public class InterviewPractice {

	public static void main(String[] args) {
		
		
		
		int[] ar= {100, -90, 8787, 898, 0, 1};      //This is the array that I created
		
		Arrays.sort(ar);							//This sorts the arrays from least to greatest
		
		int first = ar[0];							//Here I am declaring the variable and starting from the first index 0/-90
		int last = ar[ar.length-1];					//Here I am declaring the variable and starting from the last index, since this is sorted it will display the last 
		
		System.out.println(first);
		System.out.println(last);
		
		
		System.out.println("***************************************************");
		
		
		int [] oldArray = {1, 5, 6, 10, 25, 17};
		
		Arrays.sort(oldArray);
		
		int min = oldArray[0];
		int max = oldArray[5];
		
		System.out.println(min);
		System.out.println(max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
