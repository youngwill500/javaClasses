package com.class26;

import com.class26.Degree.Undergrad;

public class BankTest {

	public static void main(String[] args) {
	
		
		Bank bank = new Bank();
		bank.money = 900;
		double fee = bank.chargeFee();
		System.out.println("Bank fee= "+fee);
		
		PNC pnc = new PNC();
		pnc.money = 900;
		double pncFee = pnc.chargeFee();
		System.out.println("PNC fee= "+pncFee);
		
		
		
		
		
				
		
		

	}

}
