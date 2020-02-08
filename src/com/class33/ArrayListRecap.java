package com.class33;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRecap {

	public static void main(String[] args) {
	
		ArrayList <Integer> numbers=new ArrayList <>();
		numbers.add(1);
		numbers.add(10);
		numbers.add(100);
		numbers.add(1000);
		
		int size = numbers.size();
		System.out.println(size); //4
		
		//add more
		numbers.add(10000);
		

		// remove value from an arrayList
		numbers.remove(4);
		System.out.println(numbers);
		
		
		//retrieve value from arrayList
		int element = numbers.get(0);
		System.out.println(element);
		
		//1. for loop
		for (int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		//2. Advanced Loop
		
		for (int num:numbers) {
			System.out.println(num);
		}
		
		// Retrieve them backwards
		
		for (int i = numbers.size()-1; i>= 0; i--) {
			System.out.println(numbers.get(i));
		}
		
		Iterator<Integer>it =numbers.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		
		
 }
	
}