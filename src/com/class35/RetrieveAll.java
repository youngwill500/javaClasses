package com.class35;

import java.util.*;

public class RetrieveAll {

	public static void main(String[] args) {
		
		//Crate a map of a person(name, lastName, address, city, state)
		
		Map<String, String> personMap = new LinkedHashMap<>();
		
		personMap.put("Name", "Ahment");
		personMap.put("LastName", "Yildiz");
		personMap.put("Address", "123 Test");
		personMap.put("City", "Dallas");
		personMap.put("State", "TX");
		
		System.out.println(personMap);
		
		//how to retrieve a specific value?
		String value = personMap.get("State");
		System.out.println(value);
		
		//how to retrieve all keys and values
		System.out.println("--------Printing all keys----------");
		Set<String> keys=personMap.keySet();
		
		//how can I retrieve and print values key:value using for loop
		for(String key:keys) {
			System.out.println(key+":"+personMap.get(key));
		}
		
		//how can I retrieve and print values keyr
		Iterator<String> keysIterator=keys.iterator();
		while(keysIterator.hasNext()) {
			System.out.println(keysIterator.next());
		}
		
		//how can i retrieve and print values key:value using iterator
		
		Iterator<String> keysIterator1=keys.iterator();
		while(keysIterator1.hasNext()) {
			//System.out.println(keysIterator1.next()+":"+personMap.get(keysIterator1.next()));
		String mapKey = keysIterator1.next();
		String mapValue = personMap.get(mapKey);
		
		System.out.println(mapKey+":::"+mapValue);
		
		}
		
		
	
		
		
		
		
		

	}

}
