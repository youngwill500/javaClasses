package com.AlexLee;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList <Integer>();
		list.add(3);
		list.add(6);
		list.add(11);
		
		
		
		Iterator<Integer> it = list.iterator(); //creates the iterator, sets it to the begin
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		ArrayList<String> cars = new ArrayList<>();
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Tesla");
		cars.add("Range Rover");
		
		
		Iterator<String> itCars = cars.iterator();
		while(itCars.hasNext()) {
			System.out.println(itCars.next());
		}
		
		Iterator<String> it1 = cars.iterator();
		it1.next();
		it1.next();
		it1.next();
		it1.n
		it1.remove();
		System.out.println(cars);
		

	}

}
