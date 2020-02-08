package com.class34;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo extends LinkedHashSetDemo2{

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
		
		//create a collection that won't allow duplicates 
		//and sorts objects in accesding order (0-9, A-Z)
		
		Set <Integer> tset = new TreeSet<>();
		tset.add(200);
		tset.add(2000);
		tset.add(20);
		tset.add(999);
		tset.add(0);
		tset.add(999);
		tset.add(0);
		
		System.out.println(tset.size());
		System.out.println(tset);
		
		List <String> list = new ArrayList<>();
		list.add("Java");
		list.add("Selenium");
		list.add("TestNG");
		
		//Objects from both collections
		Set<String> linkedSet = new TreeSet<>();
		linkedSet.addAll(fruitSet);
		linkedSet.addAll(list);
		
		System.out.println(linkedSet);

	}

}
