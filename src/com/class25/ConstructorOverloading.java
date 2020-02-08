package com.class25;

//Can You Overload Constructors? Yes, by adding different or multiple parameters. 
// also by adding different number of parameters, datatype, or sequence of parameter.


public class ConstructorOverloading {
	
	ConstructorOverloading() {
		System.out.println("I am non-argument constructor");
	}
	
	ConstructorOverloading(String str){
		System.out.println("I am constructor with 1 String param");
	}
	
	//having different type of parameters
	
	ConstructorOverloading(int num) {
		System.out.println("I am constructor with 1 int param");
	}
	

}
