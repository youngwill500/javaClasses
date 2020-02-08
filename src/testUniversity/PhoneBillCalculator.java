package testUniversity;

import java.util.Scanner;

/*
 * Calculate the final total of someone's cell phone bill.
 * 
 * Allow the operator to input the plan fee and the number of overage minutes.
 * 
 * Charge the user 0.25 for every minute they were over their plan, and 15% tax on the sub total.
 *  
 * Create seperate methods to calculate the tax overage fees, and final total 
 * 
 * Print the itimized bill 
 * 
 */

public class PhoneBillCalculator {

	static double overCharge = 0.25;
	static double tax = 0.15;
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		double price = priceOfPlan();
		int minutes =  howManyOverMin();
		double Overage = OverageFees(minutes);
		double theTax = CalculateTax(price, Overage);
		finalTotal(price, Overage, theTax);
		scan.close();

	}

	public static double priceOfPlan() {
		System.out.println("What is the price of the plan?");
		double planPrice = scan.nextDouble(); // 82.45
		return planPrice;

	}

	public static int howManyOverMin() {
		System.out.println("How many minutes were you over?");
		int overMin = scan.nextInt(); // 9
		return overMin;
	}

	public static double OverageFees(int minutes) {

		double theOverageFee = minutes * overCharge;
		return theOverageFee;
		
	}

	public static double  CalculateTax(double price, double Overage) {
		
		double totalTax = tax*(price+Overage);
		return totalTax;
	

	}

	public static void finalTotal(double Totalprice, double TotalOverage, double theTax) {
		
		double Total = Totalprice + TotalOverage + theTax;
		
		System.out.println("The price of your plan is "+Totalprice);
		System.out.println("Your overage fee is       "+TotalOverage);
		System.out.println("The tax is                "+theTax);
		System.out.println("Your total is             "+Total);
		
		
		

	}

}
