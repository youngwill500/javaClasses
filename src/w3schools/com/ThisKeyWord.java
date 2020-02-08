package w3schools.com;

public class ThisKeyWord {

	//Creating instance variables 
	
	public String name;
	public int nameId;
	public String job;
	public int suite;
	
	
	//Creating a method
	
	public ThisKeyWord(String name, int nameId, String job, int suite) {   //local variables are within a method
		
		name = name;
		this.nameId = nameId;
		this.job = job;
		this.suite = suite;
		
		System.out.println("Person's name is "+name+" and Id is"+nameId+" and job is "+job+" and has requested a suite in "+suite);
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		ThisKeyWord obj = new ThisKeyWord("Kenwill", 123467, "President", 234); // in order to access our instance variables we need to create an object
		
		
		ThisKeyWord obj1 = new ThisKeyWord("Kenwill", 123467, "President", 234);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
