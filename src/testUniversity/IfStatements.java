package testUniversity;

import java.util.Scanner;

public class IfStatements {

	public static void main(String[] args) {
		int Salary = 1000;
		int Bonus = 250;
		
		
		System.out.println("How many cars did you sell?");
		Scanner scan = new Scanner(System.in);
		int Sales = scan.nextInt();
		
		if(Sales>=10) {
			System.out.println("You just earned : "+(Salary+Bonus));
		}else {
			System.out.println("Sorry, you didnt earn anything");
		}

	}

}
