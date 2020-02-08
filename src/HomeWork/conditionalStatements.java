package HomeWork;

import java.util.Scanner;

public class conditionalStatements {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);


		System.out.println("Please tell me your gender M or F");
		String gender = scan.next();
		
		int age = 40;
		
		if(gender.equals("M")) {
			if(age>=25) {
				System.out.println("Man");
			}else {
				System.out.println("Boy");
			}
		}else if(gender.equals("F")) {
			if(age>=25) {
				System.out.println("Woman");
			}else {
				System.out.println("Girl");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
