package com.class32;

import java.util.ArrayList;

public class ArrayListCopy {

	public static void main(String[] args) {
	
    ArrayList<String>arrayList = new ArrayList<>();
    
    arrayList.add("BMW");
    arrayList.add("Benz");
    arrayList.add("Tesla");
    		
    
    System.out.println(arrayList.get(1));
    System.out.println(arrayList.get(0));
    System.out.println(arrayList.get(2));
    
    int Asize = arrayList.size();
    System.out.println(Asize);
    
    arrayList.add("Honda");
    arrayList.add("Jag");
    
    int Asize1 = arrayList.size();
    System.out.println(Asize1);
    
    arrayList.set(2, "Lambo");
    
    System.out.println(arrayList.get(2));
    
    for(String cars:arrayList) {
    	System.out.println(cars);
    }
    
    arrayList.rem
		
		
		
	}

}
