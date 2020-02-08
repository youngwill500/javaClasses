package com.class35;

import java.util.*;

public class AccessAndUpdate {

	public static void main(String[] args) {
		
		//How can I access/update 1 value from the Set collection
		
		Set<String> lset = new LinkedHashSet<>(); //Keep the order
		lset.add("Morning");
		lset.add("Noon");
		lset.add("Evening");
		lset.add("Night");
		
		
		
		//Convert to the ArrayList
		List<String> myList = new ArrayList<>(); 
		 myList.addAll(lset);
		 String element = myList.get(2);
		System.out.println(element);
		
		
		

	}

}
