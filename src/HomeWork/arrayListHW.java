package HomeWork;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListHW {

	// Remove (hi, sup, boop, it should only say "yo, yolo'

	public static void main(String[] args) {

	
		 ArrayList <Integer> list=new ArrayList<Integer>();
			for(int i=0;i<=5;i++) {
			list.add(i);
			
		}
		for (Object object : list) {
			System.out.print(object+", ");
}

	}

}
