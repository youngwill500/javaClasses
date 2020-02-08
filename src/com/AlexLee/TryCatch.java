package com.AlexLee;

public class TryCatch {

	public static void main(String[] args) {
		
		 // It will try to do the code within "TRY", if an exception occurs it will perform what's inside the catch
		
		try {
			int [] a = {4,5,1};
			System.out.println(a[3]);
		} catch (Exception e) {
			System.out.println("Number was not found, sorry");
		}
		
		
		

	}

}
