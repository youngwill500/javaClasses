package com.class34;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//Lets create a collection of vegtables where i do not want to have duplicates
		
		HashSet<String> hset = new HashSet<>();
		
		hset.add("cucumber");
		hset.add("onion");
		hset.add("pepper");
		hset.add("zuccini");
		hset.add("carrot");
		hset.add("zuccini");
		
		
		System.out.println(hset.size());
		System.out.println(hset);
		
		 //they do not have any methods to retrieve elements from the collection 
		//.get();, .set();
		
		//how can we retrieve all elements?
		//iterator
		
		Iterator<String> it = hset.iterator();
		
		while(it.hasNext() ) {
			String element = it.next();
			System.out.println(element);
		}
		

	}

}
