package com.class12;

public class SingleArrayRecapDemo {

	public static void main(String[] args) {
		
		int [] array1 = new int[4] ;
		array1[0] = 12;
		array1[1] = 13;
		array1[2] = 14;
		array1[3] = 14;
		
    //System.out.println(array1[1]);
		
		int [] array2 = {2,5,4,7};
		
		for(int j: array2) {
			System.out.println(j);
		}
		
System.out.println("****************");		

		 
		 
		
		
 for (int s=0; s < array1.length; s++) {
	 
	 System.out.println(array1[s]);
	 
 }
	
 System.out.println("****************");
 
 for(int i: array1) {
	 System.out.println(i);
 }
 
 
 System.out.println("****************");
 
 
 int [] Add = {2,5,4,7};
 
 int sum = 0;
 for(int K = 0; K < Add.length; K++) {
	 sum=sum+Add[K];
	 System.out.println(sum);
 }
 
 
 
 
 
 
 
		
	}

}
