package JavaQuizzes;

public class QuizTwo {

	public static void main(String[] args) {

		
		int nums[] = { 12, 15, 16, 17, 19 };    			 // There are 5 Arrays

		   for (int i = nums.length-1; i >0; i--) {			// 

		      System.out.println(nums[i]);

		    }
		
		// .length begins at 1.. If we use BOOK as an example. We would count the characters as 1234
		//   
		   
		   
		   String c = "Hello i love java";
		   boolean var;
		   var = c.startsWith("hello");
		   System.out.println(var);  
		   
	       String word ="abrakadabra";

	       String replace=word.replaceAll("[^aAeEiIoOuU]", " ");

	       System.out.println(replace);
	       
	       String str_Sample = "RockStar";
	       System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));
		
		
		
		
		
		
	}

}
