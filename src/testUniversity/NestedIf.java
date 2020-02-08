package testUniversity;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		
		int requiredSalary = 30000;
		int requiredYearsEmployed = 2;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How much money do you make?");
		int Salary = scan.nextInt();
		
		System.out.println("How many years have you been working there?");
		int Years = scan.nextInt();
		
		
		if(Salary>=requiredSalary) {
			if(Years>=requiredYearsEmployed) {
				System.out.println("You qualify for a loan");
			}else {
				System.err.println("Sorry, you must have worked at your current job for atleast "+ requiredYearsEmployed + "years." );
			}
		}  else {
			System.out.println("Sorry, you must atleast "+Salary+" per year.");
		}
		
		
		
		
		
		
		

	}

}
