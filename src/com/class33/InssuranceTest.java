package com.class33;

import java.util.ArrayList;
import java.util.List;

public class InssuranceTest {
	
	public static void main(String[] args) {
		
		
		Insurance car = new Car("Geico", "Ford");
		Insurance pet = new Pet("Geico", "Dog");
		Insurance health = new Health("Geico");
		
		List <Insurance> insurance = new ArrayList<>();
		insurance.add(car);
		insurance.add(pet);
		insurance.add(health);
		
		for(int i = 0; i <insurance.size(); i++) {
			insurance.get(i).getQuote();
			insurance.get(i).cancelInsurance();
		}
		
		for(Insurance all:insurance) {
			all.getQuote();
			all.cancelInsurance();
		}
		
		
		
		
		
	}

}
