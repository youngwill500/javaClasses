package com.class35;

import java.util.*;
import java.util.Map.Entry;

public class RetrieveAllMap {

	public static void main(String[] args) {
	
		
		//Let's create a map of a classroom in which we will store objects
		//and it's quantities. 
		
		Map<String, Integer> classRoom = new HashMap<>();
		classRoom.put("Instructor", 3);
		classRoom.put("Student", 80);
		classRoom.put("Tables", 20);
		classRoom.put("Chairs", 80);
		
		System.out.println(classRoom);
		
		Set<Entry<String, Integer>>entrySet = classRoom.entrySet();
		
		//using for each loop to get all entry objects
		
		for(Entry<String, Integer> entry:entrySet) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		//using iterator to get all entry objects
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			
		}
		
		
	}

}
