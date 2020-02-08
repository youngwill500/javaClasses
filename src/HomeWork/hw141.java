package HomeWork;

public class hw141 {

	public String label;
	public double price; 
	public String category;
	public boolean hasExpiration; 
	public int stock;
	
//	
//	Step 2: Write three constructors:
//
//		* The main constructor( with all parameters)
//		* Second constructor with all parameters except category and hasExpiration (category defaults to "misc", hasExpiration defaults to false inside constructor)
//		* Third constructor all the parameters except category, expiration, and stock (stock default to 0 inside the constructor)
	
	
	
	hw141(String label1,double price1, String category1, boolean Expired, int stock1) {
		
		label = label1;
		price = price1;
		category = category1;
		hasExpiration = Expired;
		stock = stock1;
		
	}
	
	
	hw141(String label1,double price1, int stock1) {
		
		label = label1;
		price = price1;
		category = "misc";
		hasExpiration = false;
		stock = stock1;
		
	}
	
	hw141(String label1,double price1) {
		
		label = label1;
		price = price1;
		stock = 0;
		
	}
	
	
	void getDetails() {
		System.out.println(label+" "+price+" "+category+" "+hasExpiration+" "+stock);
	}
	
	
	
	public static void main(String[] args) {
		
		hw141 obj = new hw141("Eggs",3.0 , "produce", true, 10);
		hw141 obj1 = new hw141("Paper Towels", 2.0, 24);
		hw141 obj2 = new hw141("Towels", 2.0);
		
		obj.getDetails();
		obj1.getDetails();
		obj2.getDetails();
		
		
		
	
		
		
		
		
		
	}
	
	
	
	
	
}
