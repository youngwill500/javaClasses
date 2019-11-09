package reviewClass;

public class toCharArrayDemo {

	public static void main(String[] args) {
		
		String longStr = "I am very happy today, because today is Monday";
		
		char[] charArray = longStr.toCharArray();    // This places the sentence in an array
		
	//	for (int i = 0; i < charArray.length; i++) {
	//		System.out.print(charArray[i]);          //This prints every char in the same line
	//	}
		
		
	//	for (int i = charArray.length - 1; i>=0; i--) {
	//		System.out.println(charArray[i]);	     //This prints the reverse of an array
	//	}
		
		
		for (char element: charArray) {				// enhanced or for-each loop
			System.out.print(element);
		}
	
		
		System.out.println();
		
		String anotherStr = "";						//This has to be null
		
		for(char element : charArray) {   
			if (element == 'a') {
				anotherStr += 'e';
			}else {
				anotherStr += element;
			}
		}
		System.out.println(anotherStr);
		
		
		
		
		
		
		
		

	}

}
