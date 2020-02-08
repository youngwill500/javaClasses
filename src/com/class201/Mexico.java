package com.class201;

public class Mexico {

	public static void main(String[] args) {
		
     //When USA public
     USA us2 = new USA();
     System.out.println("Access from Mexico class");

      System.out.println(us2.mainState);
        System.out.println(us2.school);
        System.out.println(us2.capitalCity);
        
        //When USA is default
        //I cannot access USA class
     USA us3 = new USA();
     System.out.println(us3.mainState);
        
   


		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
