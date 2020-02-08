package com.class34;

import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		//create a list of Sweets Objects
		
		LinkedList<Sweets> sweetList = new LinkedList <>();
		sweetList.add(new Sweets("Chocolate"));
		sweetList.add(new Sweets("Cake"));
		sweetList.add(new Sweets("Cookies"));
		sweetList.add(new Sweets("Macaroons"));
		
		//lets display name of each sweet objects
		
		for(Sweets element: sweetList) {
			System.out.println(element.name);
			element.iLove();
		}
		
		//retrieving 1 element and accessing method (2steps)
		Sweets mySweet = sweetList.get(2);
		mySweet.iLove();
		
		//retrieving 1 element and accessing method (2steps)
		sweetList.get(2).iLove();
		String nameOfTheSweet=sweetList.get(2).name;
		System.out.println(nameOfTheSweet);
		
		String
		
		
		
	}
	

}
