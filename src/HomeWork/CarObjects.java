package HomeWork;

public class CarObjects {
	

	  String model;
	  double price;
	  int quantity;
	  
	  CarObjects(String model, double price, int quantity){
	    this.model = model;
	    this.price = price;
	    this.quantity = quantity;
	    
	  }
	  
	  
	  
	  void carStockValue(){
	    
		  double value = 0.0;
		  
		  value = this.quantity * price;
	
	    System.out.println(model+" stock value "+value);
	    
	    
	  }

	  public static void main(String[] args) {
		    CarObjects toyotaCar = new CarObjects("Toyota 2019", 25000,100); 
		    toyotaCar.carStockValue(); 
		    CarObjects bmwCar = new CarObjects("BMW 2017",26119.20,25);
		    bmwCar.carStockValue();
	  
	  
		   
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
