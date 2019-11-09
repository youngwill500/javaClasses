package InterviewQuestions1;

public class FifthQuestion {

	public static void main(String[] args) {
	
		
		/*
		 * Write a java program to reverse String?    (This means letter by letter) 
		 * Reverse a string word by word?
		 * 
		 */
		
		
		
		
		// This is the solution for Part 1 "Write a java program to reverse String?"
		//toCharArray(); charAt();
		
		String given1= "Today is the Java Class";         //This is the original sentence
		char [] charArray = given1.toCharArray();		// This sentence is placed in a charArray 
		
		for(int i = charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}
		
		
		
		System.out.println();
		
		
		
		// This is the solution for Part 2 "Reverse a string word by word" 
		
		/*
		 * to reverse String
		 * Step1: spit --> array of String
		 * Step2: use for loop and use decrement to print values
		 * Step3: 
		 */
		String given = "Welcome to the Java class";
		
		String reversed = "";							//This string is empty
		String [] str = given.split(" ");				//This places the "given" in an array and splits it by space 
		for (int j=str.length-1;j>=0;j--) {				//This for loop is reversing the string 
			reversed = reversed+str[j]+" ";
		}
		System.out.println(reversed);
		
		
		
		
		
		

	}

}
