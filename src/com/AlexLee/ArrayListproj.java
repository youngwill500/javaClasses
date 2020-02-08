package com.AlexLee;

import java.util.ArrayList;

public class ArrayListproj {

	public static void main(String[] args) {
	
		//Created an arrayList, unable to print all the arrays
		String[] letters = {"A","B","C","D"};
		System.out.println(letters[0]);
		System.out.println(letters);
		System.out.println(letters.length);
		System.out.println(letters.length-1);
		
		ArrayList fruitList = new ArrayList();
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Grapes");
		System.out.println(fruitList);
		
		fruitList.remove(1);
		System.out.println(fruitList);
		
		int bucky[] = {3,4,5,6,7};
		int total = 0;
		
		for(int x:bucky) {
			total+=x;
		}
		System.out.println(total);
		
		
	
		
		
		
	}

}
