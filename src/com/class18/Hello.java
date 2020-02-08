package com.class18;

public class Hello {

	void sayHello() {

		System.out.println("Hello Asel");

	}

	public static void main(String[] args) {

		Hello obj = new Hello();
		obj.sayHello();
		obj.sayHelloDifferentLanguage("USA");
		obj.sayHelloDifferentLanguage("Russia");
		
		obj.sayNameAndAge("Jack", 45);
		obj.isSnowing(false);
		
	}

	/*
	 * create a method that will say hello in different language based on the value
	 * that will be passed when user calls a method
	 */

	void sayHelloDifferentLanguage(String country) {

		// switch(country.toLowerCase()) { We can also convert to lowercase

		switch (country) {

		case "USA":
			System.out.println("Hello");
			break;
		case "Russia":
			System.out.println("Privet");
			break;
		case "Paraguay":
			System.out.println("Hola");
			break;
		case "Albania":
			System.out.println("Pershendetje");
			break;
		default:
			System.out.println("Idk your language");

		}

	}

	
	//method to say name and age
	
	void sayNameAndAge(String name, int age) {
		System.out.println("My name is "+name+" and I am "+age+" years old");
		
	}
	
	//create a method that will check if it is snowing
	//if snow ---> stay at home, otherwise go for a walk
	
	void isSnowing(boolean isSnowing) {  //Method Name/Header + (Parameter)
		
		//method body
		
		if(isSnowing) {
			System.out.println("Stay Home");
		}else {
			System.out.println("Go for a walk");
		}
		
	}
	
	
	
	
	
	
}
