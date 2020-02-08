package com.Class22;

public class AccessingStaticVariables {

	public static void main(String[] args) {
		
		StaticHusky obj = new StaticHusky();
		System.out.println(obj.name);
		obj.name = "Emoney";
		System.out.println(obj.name);
		
		System.out.println(StaticHusky.breed);
		StaticHusky.breed = "New breed";
		System.out.println(obj.breed); //possible but not preferable 
		
		

	}

}
