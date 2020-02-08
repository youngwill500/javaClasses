package com.class34;

import java.util.Iterator;
import java.util.LinkedList;

public class CardTest {

	public static void main(String[] args) {

		
		
		//Created 3 objects of the card and store them to a link list 
		LinkedList <Card> list = new LinkedList<>();
			list.add(new Visa("Visa"));
			list.add(new MC("MasterCard"));
			list.add(new AMEX("American Express"));
			
			
		//Iterator helps call methods of each element
			
			Iterator <Card> cardIterator = list.iterator();
			
			while(cardIterator.hasNext()) {
				Card cc = cardIterator.next();
				cc.cashBack();
				cc.creditLimit();
			}
			
			
		
		
		

	}

}
