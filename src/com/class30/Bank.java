package com.class30;

public interface Bank {
void haveChecking();
void haveSavings();
}

interface Trustable {
	void trust();
}

class Finance {
	public void financing() {
		System.out.println("Financial transactions must happen");
	}
}

class BOA extends Finance implements Bank, Trustable {

	public void trust() {
		System.out.println("You can trust BOA with your money");
	}

	@Override
	public void haveChecking() {
		System.out.println("BOA has a checking account");

	}

	@Override
	public void haveSavings() {
		System.out.println("BOA has a savings account");

	}
}
	class CapitalOne extends Finance implements Bank, Trustable {

		@Override
		public void haveChecking() {
			System.out.println("Capital One has a checking account");
		}

		@Override
		public void haveSavings() {
			System.out.println("Capital One has a checking account");

		}

		public void trust() {
			System.out.println("You can trust BOA with your money");
		}

	}
	
	class CapitalOneChild extends CapitalOne {
		
	}
