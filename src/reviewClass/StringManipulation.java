package reviewClass;

public class StringManipulation {

	public static void main(String[] args) {
	
		String str = "Hello";
												//str.length() Prints the total of characters 
		System.out.println(str.length()); 
		
		System.out.println("______________________Lower Case____________________________________");
		
		String str1 = str.toLowerCase();
												//str.toLowerCase() Prints the string to lower case
		System.out.println(str1);
		
		System.out.println("_________________________Upper Case_________________________________");
	
		String str2 = str.toUpperCase();       
												//str.toUpperCase() Prints the string in Upper case
		System.out.println(str2);
		
		System.out.println("___________________________ .equals _______________________________");
		
		boolean str3 = str.equals("Hello");    
												//str.equals("Hello") Compares the two values to see if they're equal										
		System.out.println(str.equals("HEllo"));
		
		System.out.println("_______________________Ignore Case___________________________________");
		
		boolean str4 = str.equalsIgnoreCase("Hello");  //Compares the two values but doesn't care whether or not it's
														// Capitalized or Lower case.
		
		System.out.println("_________________________Contains_________________________________");
		
		boolean str5 = str.contains("ll");
		System.out.println(str.contains("ll"));    //Checks to see if it contains these letters
		
		System.out.println("_____________________Startswith & EndsWith _____________________________________");
		
		String str6 ="Today is Saturday";	//Checks to see if the following begins with ________
		System.out.println(str6.startsWith("Today"));
		
		System.out.println(str6.endsWith("Saturday"));
		
		System.out.println("___________________________is Empty ______________________________");
		
		String str7 = "";							//Checks to see if string is empty 
		System.out.println(str7.isEmpty());
		
		System.out.println("___________________________Trim ______________________________");
		
		String str8 = "   It is Sunny   ";
		System.out.println(str8.trim());
		
		System.out.println("___________________________Index of and ChartAt______________________________");
		
		String str9 = "Tomorrow we will be done with Strig Manipulation";
		System.out.println(str9.indexOf('e'));
		System.out.println(str9.indexOf('e',11)); //Gives you the index value of 'e' after the first, which is 10. 
												 // Whenever character is not present it will give you -1
		
		System.out.println(str9.charAt(10));    //Tells you the #Position of the 'char'
		
		
		
		
		
		
		
		
		

	}

}
