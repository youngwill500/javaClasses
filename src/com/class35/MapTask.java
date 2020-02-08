package com.class35;

import java.util.HashMap;

public class MapTask {

	public static void main(String[] args) {
	
	HashMap<Integer, String> map = new HashMap<>();
	map.put(1, "Google");
	map.put(2, "Syntax");
	map.put(3, "Amazon");
	map.put(1, "HULU");
	map.put(2, "NASA");
	map.put(4, "Amazon");
	map.put(5, "Google");
	
	int size = map.size();
	System.out.println(size);
	
	map.replace(4, "SnapChat");
	map.remove(5);
	
	System.out.println(map);
	
	
	
	}

}
