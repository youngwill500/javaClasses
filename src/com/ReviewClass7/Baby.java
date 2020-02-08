package com.ReviewClass7;

public class Baby {

//Properties "What baby does"	

	String firstName;
	String lastName;
	char gender;
	int weight;
	String hairColor;

	void talk() {
		System.out.println("Blah, Blah, Blah");
	}

	void walk(int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("Crawl");
		}

	}

	void cry() {
		System.out.println("Cry every minute");
	}

}
