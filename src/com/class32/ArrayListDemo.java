package com.class32;

import java.util.ArrayList;

import com.class33.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
	
	
	ArrayList<String>arrayList = new ArrayList <>(); //Created object of the arraylist and we are storing <String>
	//to store values inside your collection 
	arrayList.add("John");
	arrayList.add("Jane");
	arrayList.add("Jack");
	
	//to retrieve the value from arrayList
	System.out.println(arrayList.get(2));    
	
	//add more values
	arrayList.add("James");
	arrayList.add("John");
	arrayList.add("Jane");
	
	
	//how many elements inside your arrayList?
	int size = arrayList.size();
	System.out.println(size);
	
	//creating an object of ArrayList that will hold numeric values
	ArrayList <Integer> numArrList=new ArrayList <>();
	numArrList.add(100);
	numArrList.add(200);
	numArrList.add(300);
	
	//update the value
	numArrList.set(0, 1000);
	System.out.println(numArrList);
	
	//retrieving values
	 System.out.println(numArrList.get(2));
	 
	 
	 
	
	//retrieving ALL values using forLoop  //We use this to display value one by one  
	for(int num = 0; num < numArrList.size(); num++) {	// int "num" = counter variable, it controls the number of iterations that will happen in loop
		System.out.println(numArrList.get(num));				
	}
	
	//retrieving ALL values using enhanced forLoop
	for(Integer number:numArrList) {
		System.out.println(number);
	}
	
	
	Iterator<>iterator=numArrList.iterator();
	
	}	

}
