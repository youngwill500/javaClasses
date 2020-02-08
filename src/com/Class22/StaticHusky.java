package com.Class22;

public class StaticHusky {
	
	static String breed = "Husky";
	static int paws = 4;
	static int tale = 1;
	
	String name;
	String color;
	
	void display() {
		System.out.println("Puppy name is "+name+" and the breed is "+breed);
	}
	

	public static void main(String[] args) {
		
		StaticHusky puppy1 = new StaticHusky();
		StaticHusky puppy2 = new StaticHusky();
	
		puppy1.name = "Meatball";
		puppy2.color = "Brown";
		puppy1.display();
		
		puppy2.name ="Sharik";
		puppy2.color = "Black";
		puppy2.display();
		
		StaticHusky puppy3 = new StaticHusky();  //Here we are changing the breed to Bulldog, when we do that any future will be a breed.
		
		puppy3.name ="Sharik";
		puppy3.color = "Black";
		breed = "Bulldog";
		puppy3.display();
		
		
		

	}

}
