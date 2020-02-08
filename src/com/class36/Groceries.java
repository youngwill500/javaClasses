package com.class36;

import java.util.*;

public class Groceries {

	public static void main(String[] args) {
		
		//Create a Map of groceris that will store products and it's quantties and we want maintain the insertion order for keys
		
		//Map<Key,Value> variableName=new MapChildObject<>();
		
		Map<String, Integer> groceryMap = new LinkedHashMap<>();
		groceryMap.put("Milk", 2);
		groceryMap.put("Tea", 3);
		groceryMap.put("Onion", 5);
		groceryMap.put("Apple", 10);
		
		//retrieve single value
		groceryMap.get("Apple");
		
		//verify if specifc key or value is in the map
		groceryMap.containsKey("Milk");
		groceryMap.containsValue(2);
		
		//how to retrieve all values(numbers)?
		Collection<Integer> values = groceryMap.values();
		for(Integer val:values) {
			System.out.println(val);
		}
		
		
		Iterator<Integer> valIt = values.iterator();
		
		while(valIt.hasNext()) {
			System.out.println(valIt.next());
		}
		
		//get all keys and map them to values (milk --2)
		
		Set<String> keys = groceryMap.keySet();
		for(String k:keys) {
			System.out.println(k.toUpperCase()+"----> "+groceryMap.get(k));
		}
		
		Iterator<String>keyIterator=groceryMap.keySet().iterator();
		while(keyIterator.hasNext()) {
			String itKey = keyIterator.next();
		}
		

	}

}
