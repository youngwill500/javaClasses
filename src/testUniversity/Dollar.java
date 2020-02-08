package testUniversity;

import java.util.Scanner;

public class Dollar {

	public static void main(String[] args) {
		
		double  Quarters, Dimes, Nickels,  Pennies, Dollar;
		
		Dollar = 1.00;
		
		Quarters = 0.25;
		Dimes =  0.10;
		Nickels = 0.05;
		Pennies = 0.01;
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("How many Quarters do you have?"); //50
		double AQuarters = Quarters * scan.nextInt();
		
		System.out.println("How many Dimes do you have?"); //20
		double ADimes = Dimes * scan.nextInt();
		
		System.out.println("How many Nickels do you have?"); //10
		double ANickels = Nickels* scan.nextInt();
		
		System.out.println("How many Pennies do you have?"); //2
		double APennies = Pennies* scan.nextInt();
		
		
		double total = AQuarters + ADimes + ANickels + APennies;
		
		System.out.println(total);
		
		if(total==Dollar) {
			System.out.println("Congrats you've won");
		}else if (total<Dollar) {
			System.out.println("Im sorry you are "+(Dollar-total)+" short");
		}else if (total>Dollar) {
			System.out.println("Im sorry you are "+(total - Dollar)+" over");
		}

	}


		
	}


