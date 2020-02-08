package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskReplace {

	public static void main(String[] args) {

		/*
		 * create an arrayList of drinks If any drink has "a" or "e" replace it with
		 * water.
		 * 
		 * 
		 */

		List<String> drinks = new ArrayList<>();
		drinks.add("cola");
		drinks.add("milk");
		drinks.add("juice");
		drinks.add("coffee");
		drinks.add("tea");

		Iterator<String> it = drinks.iterator();

		for (int i = 0; i < drinks.size(); i++) {
			if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
				drinks.set(i, "Water");

			}

		}

	}

}
