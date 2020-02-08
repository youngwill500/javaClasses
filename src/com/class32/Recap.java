package com.class32;

public class Recap {

	public static void main(String[] args) {
		
		//to store single value
		int num1 = 10;
		
		//to store multiple values, we can use an array
		int[] array = {10,20,30};
		
		int [] arr = new int [3];
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		
		System.out.println(arr[2]);
		
		//to retrieve all values 1 by 1
		
		//using enhanced loop
		for (int num:arr) {
			System.out.println(num);
		}
		
		// using for loop
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		//we can store non primitive types: Objects
		Fruit f=new  Apple();
		Fruit f1=new Banana();
		Fruit f2=new Orange(); 
		
		Fruit [] fruitArray = {f,f1,f2}; 
		
		for (Fruit fr:fruitArray) {
			System.out.println(fr);
		}
		
	}

}
		
		class Fruit{
			
		}
		
		class Apple extends Fruit{
			
		}
		
		class Banana extends Fruit{
			
		}
		
		class Orange extends Fruit{
			
		}


