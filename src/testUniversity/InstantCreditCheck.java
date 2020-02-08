package testUniversity;

import java.util.Scanner;

public class InstantCreditCheck {

	static int creditScore = 700;
	static int salary = 25000;

	

	public static void main(String[] args) {
		
	int userMoney = userSalary();
	int userCredit = userCreditScore();
		userResults(userMoney, userCredit);
		
		

	}

	public static int userSalary() {

		Scanner scan = new Scanner(System.in);
		System.out.println("How much money do you make per year?");
		int userTotalSalary = scan.nextInt();
		return userTotalSalary;

	}

	public static int userCreditScore() {

		Scanner scan = new Scanner(System.in);
		System.out.println("What is your credit score?");
		int userTotalCreditScore = scan.nextInt();
		return userTotalCreditScore;

	}
	
	public static void userResults(int userMoney, int userCredit) {
		
		if(userMoney>=salary) {
			if(userCredit>=creditScore) {
				System.out.println("You are instantly approved ");
			}else {
				System.out.println("You make enough, but your credit isn't good enough");
			}
		}else {
			System.out.println("You do not make enough to be considered at this time");
		}
		
		
	}

}
