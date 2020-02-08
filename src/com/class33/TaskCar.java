package com.class33;

import java.util.ArrayList;

public class TaskCar {

	public static void main(String[] args) {
		
		ArrayList<String> car = new ArrayList <>();
		car.add("Tesla");
		car.add("Porsche");
		car.add("BMW");
		car.add("Lambo");
		
		for(String cars: car) {
			System.out.println(cars);
		}
		
		for(int i = 0; i < car.size(); i++) {
			System.out.println(car.get(i));
		}
		
		
		
		

	}

}
