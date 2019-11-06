package reviewClass;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
	
		 String str = "abracadabra alakazam";
		    String target1 = "dab";
		    String target2 = "ABRA";
		    
		    System.out.println(str.indexOf('c'));
		    System.out.println(str.indexOf(' '));
		    
		    System.out.println(str.indexOf("dab"));
		    
		    String Target3 = target2.toLowerCase();
		    
		    System.out.println(Target3.indexOf(str));
		    
		
		
		
		
		    String str1 = "boopity bop";
		    
		    System.out.println(str1.charAt(5)+""+str1.charAt(8)+""+str1.charAt(1)+""+str1.charAt(10));
		
		
		// Print out the following: "The first 3 letters of ___ is ___"
		
		    Scanner scan = new Scanner(System.in);
		    
		    System.out.println("Enter the browser name to proceed further with execution");
		    String browser = scan.nextLine();
		    
		    
		    
		    if (browser.equalsIgnoreCase("ChRoME")) {
		    	System.out.println("Proceed with Chrome browser");
		    }else if (browser.equalsIgnoreCase("FireFox")) {
		    	System.out.println("Proceed with Firefox browser");
		    }else if (browser.equalsIgnoreCase("IE")) {
		    	System.out.println("Proceed with IE browser");
		    }else {
		    	System.out.println("Invalid browser");
		   	
		    }
		    
	
		    String s1="hello how are you"; 
		    
		    /*
		     * 	Step 1: Replace the  "h" with "t".
				Step 2: Replace "you" with "hi".
				Step 3: Replace  "hello how are you"  with  "i am fine".
		     * 
		     * 
		     * 
		     */
		    
		    //System.out.println(Str.replace('o', 'T')); 
		        
		    
		    System.out.println(s1.replace('h', 't'));
		    System.out.println(s1.replaceAll("you","hi"));
		    System.out.println(s1.replaceAll("hello how are you", "i am fine"));
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		
		
		

	}

}
