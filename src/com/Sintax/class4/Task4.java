package com.Sintax.class4;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		  //  *keep asking user to pay for candy until entered price is not equal to 3
		   //  *after user got a write amount print "Please enjoy your candy"*/ 
		  int a=0;
		    while(a!=3) {
		        Scanner scan=new Scanner(System.in);
		        System.out.println("Please Pay For Coffee");
		        int price=scan.nextInt();
		        
		        a++;
		    }
		    System.out.println("Enjoy your coffee");
		    
		}
		
		
	}


