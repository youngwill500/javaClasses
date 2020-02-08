package com.AlexLee;

import java.util.*;

public class IntroToCollections {

	public static void main(String[] args) {
	
		String[] things = {"eggs","lasers","hats","pie"};
		
		List<String> list = new ArrayList<>();
		for(String x: things)
			list.add(x);
		
		String[] morethings = {"lasers", "hats"};
		List<String> list2 = new ArrayList<>();
		for(String x:morethings)
			list2.add(x);
		
		for(int i=0; i<list2.size();i++) {
			System.out.println();
		}
		
		
		System.out.println("----------------");
		
	

	}

}
