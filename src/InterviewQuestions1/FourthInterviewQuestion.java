package InterviewQuestions1;

public class FourthInterviewQuestion {

	public static void main(String[] args) {
	
		/*
		 *  How to find out the part of the string from a string? What is a substring? a
		 *  and how do you find the number of words in a string?
		 * 
		 * 
		 */
		
		
		String str="Today is very cold outside";
		String subString = str.substring(0, 5);  //This takes out a certain word, this word is "Today"
		System.out.println(subString);
		
		//Finding the number of words in the string
		
		/*Step1: split based on the space --> array of String
		 *Step2: find the length of an array 
		 * 
		 */
		
		String[] words=str.split(" ");           //This puts the sentence in an array, allowing us to count each word
		System.out.println(words.length);		// This gives us the length 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
