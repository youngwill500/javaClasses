package com.class34;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo2 {

	public static void main(String[] args) {

		//create a collection that wont allow duplicates and preserve the insertion order
		
		Set <String> fruitSet = new LinkedHashSet<>();
		fruitSet.add("Apple");
		fruitSet.add("Banana");
		fruitSet.add("Kiwi");
		fruitSet.add("Grape");
		fruitSet.add("Pinapple");
		fruitSet.add("Banana");
		
		System.out.println(fruitSet.size());
		System.out.println(fruitSet);
	}

}
