package HomeWork;

public class Car {
	
	public String make;
	public String model;
	public int numberOfDoors;
	public int topSpeed;
	public int price;
	
	Car (String make1, String model1, int numberOfDoors1, int topSpeed1, int price1) {
		
		make = make1;
		model = model1;
		numberOfDoors = numberOfDoors1;
		topSpeed = topSpeed1;
		price = price1;
		
	}
	
	
	Car(String make2, String model2, int topSpeed2, int price2) {
		
		make = make2;
		model = model2;
		numberOfDoors = 4;
		topSpeed = topSpeed2;
		price = price2;
		
	}
	
	Car ( int numberOfDoors3, int topSpeed3, int price3) {
		
		make = "unknown";
		model = "unknown";
		numberOfDoors = numberOfDoors3;
		topSpeed = topSpeed3;
		price = price3;
		
	}
	
	Car (String make1, String model1, int numberOfDoors1) {
		
		make = make1;
		model = model1;
		numberOfDoors = numberOfDoors1;
		topSpeed = 90;
		price = 0;
		
	}
	
	void Display() {
		
		System.out.println(make+" "+model+" "+" "+numberOfDoors+" "+topSpeed+" "+price);
		
	}


}
