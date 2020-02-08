package com.class35;

import java.util.HashMap;

//Map - Interface is not a apart of Collection Framework

// Map will have it's own unique methods to manipulate Data

//Inside the map we store 2 object as Key+Value --> Entry

//Map is a collection of Entry Objects
//

public class MapIntro {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map =new HashMap<>();
	//to store key+value pair into map
		map.put(101, "John");
		map.put(102, "Jack");
		map.put(103, "Jane");
		map.put(104, "Jenny");
		
		System.out.println(map);
		//how to verify if there any elements inside map 
		boolean flag = map.isEmpty();
		if(!flag) {
			int size = map.size();
			System.out.println(size);
		}
		
		//I want to add more Entry Objects
		map.put(105,"John");    //Adding duplicate values ------------> OK
		System.out.println(map);
		map.put(102, "Hasan");  //Adding duplicate keys -------> Override the value in that key, we cannot have duplicate keys
		
		//How to access a value
		String mapElement = map.get(105);
		System.out.println(mapElement);
		
		//to replace or update the value
		map.replace(103, "Zeynep");
		System.out.println(map);
		
		//how to remove an Object from a map
		map.remove(101);
		System.out.println(map);
		
		// Part 1: how to verify if certain key exist 
		boolean flag1=map.containsKey(103);
		System.out.println(flag1);
		if(flag1) {
			map.replace(103, "Seval");
		}else {
		map.put(103, "Seval");
		
		// Part 2: how to verify if certain key exist 
				boolean contains=map.containsValue("Seval");
					System.out.println(contains);
			
		}
	}

}
