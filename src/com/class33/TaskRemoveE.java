package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class TaskRemoveE {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList <>();
		list.add("cute");
		list.add("Love");
		list.add("Hello");
		list.add("Java");
		
		Iterator<String>it=list.iterator();
		
		while(it.hasNext()) {
			if(it.next().endsWith("e")) {
				it.remove();
			}
			
		}
		System.out.println(list);
	}

}
