package InterviewQuestions1;

public class SixthQuestion {

	public static void main(String[] args) {
	
		/*
		 * Write a Java Program to find whether a String is palindrome or not?
		 * if reversed string an original string sting are the same ---> string is palindrome
		 * 
		 * mom, dad, madam, racecar, kayak, bob
		 * 
		 * Logic:
		 * Step1: reverse the string
		 * Step2: compare 2 Strings:
		 * 			if strings are equal -> palindrome
		 * 			else --> not palindrome
		 * 
		 */
		
		String original = "kayak";
		String reversed = "";
				// 5-1
		
		for (int i = original.length()-1; i>=0; i--) {
			reversed = reversed+original.charAt(i); //""+k=k+a=ka+k
			
		}
		System.out.println(reversed);
		
		if(original.equals(reversed)) {
			System.out.println("String is palindrome");
			
		}else {
			System.out.println("String is NOT palindrome");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
