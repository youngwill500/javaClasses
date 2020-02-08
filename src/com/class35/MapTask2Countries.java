package com.class35;

import java.util.*;

public class MapTask2Countries {

	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<>();
		
		map.put("Florida","Miami" );
		map.put("Maryland", "Annapolis");
		map.put("Virginia","Richmond");
		map.put("California", "Los Angeles");
		
		Set<String> all = map.keySet();
		
		for(String usa:all) {
			System.out.println(all+":"+map.get(usa));
		}
		
		
		

	}

}
