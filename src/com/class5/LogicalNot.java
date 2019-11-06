package com.class5;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b1 = true;
		boolean b2 = false;

		boolean traffic = false;
		
		//if traffic --> late, else --> on time

		if (!traffic) {
			System.out.println("On Time");
		} else {
			System.out.println("Late");

		}

		//Let's compare 2 numbers using NOT operator
		
		int num1=10;
		int num2=10;
		
		if (num1==num2) {
			System.out.println("Numbers are equal");
		} else {
			System.out.println("Numbers are not equal");
		}
		
		if (!(num1==num2)) {
			System.out.println("Numbers are NOT equal");
		}else {
			System.out.println("Numbers are equal");
		}
		
		
		//if name is Marry or Anna then you are not my sister
		
		String name="Marry";
		String name2="Anna";
		// true OR false --> true add NOT --> false
		if (!(name.equals("Marry") || name.equals("Anna"))) {
			System.out.println("You are not my sister");
		} else {
			System.out.println("You're my sister");
			
			
			
			
			
		}
		
	}
	

}
