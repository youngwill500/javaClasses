package com.class4;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b = true;
		boolean ClassToday = true;

		if (b) {
			System.out.println("Hello");

			if (ClassToday) {
				System.out.println("Hello my friends");
			}
		} else {
			System.out.println("Bye");
		}
		System.out.println("I am continues code");

		boolean isFriday = true;
		int day = 13;

		if (isFriday) {
			System.out.println("Today is Friday");

			if (day == 13) {
				System.out.println("I will watch scary movie");
			} else {
				System.out.println("Today is NOT Friday");

			}
		}

	}
}
