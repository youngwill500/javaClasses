package com.class24;

public class Country {
	
	public String capital, name;
	
	Country(String countryName, String countryCapital ) {
		name = countryName;
		capital = countryCapital;
		
	}
	
	public void display() {
		System.out.println(name+" "+capital);
	}
	
	public static void main(String[] args) {
		
		Country mm = new Country("USA", "DC");
		
		mm.display();
		
	}

}
