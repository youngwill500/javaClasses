package reviewClass;

public class ReplaceDemo {

	public static void main(String[] args) {
	
	String longStr = "I am very happy today, because today is Monday";
	String anotherStr = longStr.replace('a', 'e');   // This replaces old Char with new Char 
		System.out.println(anotherStr);
		
		
	String string1 = longStr.replace('t', 'p').replace('T', 'P');  //You are able to put replace multiple times
		System.out.println(string1);
		
		
	String string2 = longStr.replace("happy", "sad");  //sequence replaces words
	String string3 = longStr.replaceAll(regex, replacement) //	Powerful replaces all
			
	String string4 = longStr.replaceAll("[a-z]", "1"); //This replaces all the letters with 1
	String string5 = longStr.replaceAll("[a-zA-Z]", "1"); // This replaces all letters lower and capital case with 1
	
	String SS;
	
	SS = "My Social Security number is "
	
	
			String string6 = longStr.replaceAll("[^a-zA-Z]", "1");	// ^ In this case we are saying replace everything except letters 	
			
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
