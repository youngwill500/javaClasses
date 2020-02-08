package HomeWork;

public class ShoppingStore {
	
	public String item;
	public double price; 
	public int quantity;
	
//	create one constructor with parameters of item, price and quantity. 
//	in constructor assign the parameter value to class level value. (use this keyword). 
//
//	Create a method with name itemTotalPrice. 
//	write a logic to to calculate the total values of items in stock. and print the result. 
//	return the total value. 
	
	

	
	ShoppingStore(String item, double price, int quantity){
		this.item = item;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public double itemTotalPrice() {
		double totalvalue = this.price * this.quantity;
		System.out.println(this.item + " Stock Value " + totalvalue);
		
		return totalvalue;
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
