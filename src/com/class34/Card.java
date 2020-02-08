package com.class34;

public abstract class Card { // Abstract class because we know some of the methods will be unimplemented

	String CardType; // Instance Variable

	Card(String CardType) { // Constructor that initializes the variable "CardType"
		this.CardType = CardType;
	}

	public abstract void creditLimit(); // Abstract class, since the method will be different for everyone

	public void cashBack() {
		System.out.println(CardType + " gives cash back of 3%");
	}
}

class Visa extends Card {

	Visa(String CardType) {
		super(CardType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void creditLimit() {
		System.out.println("Credit Limit of the card the " + CardType + " is $1500");

	}

}

class MC extends Card {

	MC(String CardType) {
		super(CardType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void creditLimit() {
		System.out.println("Credit Limit of the card the " + CardType + " is $2500");

	}

}

class AMEX extends Card {

	AMEX(String CardType) {
		super(CardType);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void creditLimit() {
		System.out.println("Credit Limit of the card the " + CardType + " is $4500");

	}

}