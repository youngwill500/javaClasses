package reviewClass;

public class SplitDemo {

	public static void main(String[] args) {
		
		//Split returns an array of Strings
		
		String longStr = "I am very happy today, because today is Monday";
		
		String [] anotherStr = longStr.split("today");     //Everytime we see "today" we CUT, so longStr has 3 Strings.. Today does not appear
		System.out.println(anotherStr.length);	
		
	//	System.out.println(anotherStr[0]);
	//	System.out.println(anotherStr[1]);
	//	System.out.println(anotherStr[2]);
		
		for(int i = 0; i < anotherStr.length; i++) {   
			if (i == anotherStr.length - 1) {
				System.out.println(anotherStr[i]);
			}else {
			System.out.println(anotherStr[i] + "today");
		    }
			
		}
		
	System.out.println("----------For each------------");
	
	for (String str: anotherStr) {
		System.out.print(str);
	}
		
		
	System.out.println("----------Split Capital Letters------------");	
	
	anotherStr = longStr.split("[A-Z]");
	System.out.println(anotherStr.length);
		
	System.out.println("----------Index Of------------");	
	
	System.out.println(longStr);
	
	
	
		
		
		
		
		

	}

}
