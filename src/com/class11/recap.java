package com.class11;

public class recap {

	public static void main(String[] args) {
		
//	int [] numbersList = {2,3,5,7};
		
//		for(int element:numbersList) {
//			System.out.println(element);
//		}
	
		
		
String [] carList = {"BMW", "Honda", "Ferrari", "Benz", "Toyota", "Ford"};

	for (String element:carList) {
		System.out.println(element);
	}

	
	System.out.println("************");
	
	
int [] numList = {1,2,3,4,5};

int sum = 0;

for (int elemen:numList) {
		sum += elemen;
}
		System.out.println(sum);
		
		System.out.println("************");		
		
		//Create an array of countries. 
		//While retrieving all values from an array print capital for each country. 
		//(use 2 different loops).		
		
String [] States = {"NY", "CALI", "Florida", "Washington"};

for (String elem:States) {
	
	switch (elem) {
	
	case "NY":
		System.out.println("New York");
		break;
		
	case "CALI":
		System.out.println("Los Angeles");
		break;
	
	case "Washington":
		System.out.println("Seattle");
		break;
		
	case "Florida":
		System.out.println("Miami");
		break;		
	
	}
}
		

System.out.println("********************");
		
String [] Countries = {"America", "Peru", "Japan", "Italy"};

for (int i=0; i < Countries.length; i++) {
	
	if(Countries[i].equals("America")) {
		System.out.println("Washington D.C.");
	}else if(Countries[i].equals("Peru")) {
		System.out.println("Lima");
	}else if(Countries[i].equals("Japan")) {
		System.out.println("Tokyo");
	}else if(Countries[i].equals("Italy")) {
		System.out.println("Rome");
	}
	
}
		
		
		
	}

}
