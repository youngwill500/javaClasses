package testUniversity;

import java.util.Scanner;

public class ForLoopChar {

	public static void main(String[] args) {
		
		//Search a string to determine if it contains the letter "A"
		
		System.out.println("What is your name?");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		
		
		boolean LetterFound = false;
		
		for(int i = 0; i < name.length(); i++) { // looping through the String text to determine whether or not it has "b"//  We use ".length" because it represents the same number of characters within that string.
			char CurrentLetter = name.charAt(i); // index = every time we come through this loop, the first time they'll get the first letter and so on. 
			
			if(CurrentLetter == 'A' || CurrentLetter == 'a') {
				LetterFound = true;
				break;
			}
		}
		
		if(LetterFound) {
			System.out.println("The letter A was found");
		}else {
			System.out.println("The letter A was NOT FOUND");
		}
		
		
		
		
//		boolean letterFound = false;
//		
//		for(int i=0; i < name.length(); i++) {
//			char letter = name.charAt(i);
//			if(letter == 'A'  || letter == 'a') {
//				letterFound = true;
//				break;
//			}
//			
//		} 
//		
//		if(letterFound) {
//			System.out.println("This text contains the letter A");
//		}else {
//			System.out.println("This text does not contain the ltter A");
//		}
//		
//		

	}

}
