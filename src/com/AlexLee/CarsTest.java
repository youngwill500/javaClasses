package com.AlexLee;

public class CarsTest extends Cars {

	CarsTest(String Brand, int hp) {
		super(Brand, hp);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Racing r = new Racing(false, "Ferrari 458", 458);
		GT gt = new GT(180, "RollsRoyce", 550);
		
		String GTCarBrand = gt.Brand;
		
		System.out.println(GTCarBrand);
		
		EmpName("Kenwill");
		
		

	}



}
