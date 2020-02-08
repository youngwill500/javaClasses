package com.class35;

import java.util.LinkedHashMap;

public class MapTsk {

	public static void main(String[] args) {
		
		
		LinkedHashMap<Integer, String> Building = new LinkedHashMap<>();
		Building.put(1, "Google");
		Building.put(2, "Syntax");
		Building.put(3, "Kenwill Inc");
		Building.put(4, "Facebook");
		Building.put(5,"SnapChat");
		Building.put(6,"LinkedIn");
		Building.put(7,"Dealeron");
		
		int size = Building.size();
		System.out.println(size);
		
		Building.replace(4, "BlackManBlackTie");
		Building.remove(7);
		
		System.out.println(Building);
	}

}
