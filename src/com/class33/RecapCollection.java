package com.class33;

import java.util.ArrayList;
import java.util.Iterator;



public class RecapCollection {

	public static void main(String[] args) {
	
		
		ArrayList<Integer> numbers = new ArrayList <>();
		numbers.add(1);
		numbers.add(10);
		numbers.add(100);
		numbers.add(1000);

		//Checks the size 
		int size = numbers.size();
		System.out.println(size);
		
		//add more
		numbers.add(10000);
		
		//remove
		numbers.remove(2);
		System.out.println(numbers);
		
		
		//Retrieve value from an arrayList
		int element = numbers.get(0);
		System.out.println(element);
		
		//1. for loop
		
		for(int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		//2. advanced loop
		
		for(int num:numbers) {
			System.out.println(num);
		}
			
		// I want to get values backward
			for(int i = numbers.size()-1; i>0; i--) {
				System.out.println(numbers.get(i));
			}
			
			
			
		//Iterator is interface that helps to iterate/traverse through collections/ through each element inside the collection (List, set, queue)
			
		//Iterator we have 3 methods:
		// hasNext(); -- returns boolean if there is a next element in the collection
		//	next(); --> returns that next element
		// remove(); --> removes that next element 
			
		//	Each collection will have an access to the iterator method that will be returning 1 object of the iterator type
			
			//3 using Iterator
			Iterator<Integer>iterator=numbers.iterator();
			
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			
			
		
		
	}

}
