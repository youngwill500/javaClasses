package com.class35;

import java.util.*;

public class SetRecap {

	public static void main(String[] args) {
		
		int[] array = {12,12,13,14};
		
		for(int x:array) {
			System.out.println(x);
		}
		
		Set<Double> set = new LinkedHashSet<>();
		set.add(99.99);
		set.add(90.99);
		set.add(9.99);
		
		//Retrieving Objects: Iterator
		
		Iterator <Double> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			double d=iterator.next();
			System.out.println(d);
			
		}
		
		for(double d1:set) {
			
		}
	}

}
