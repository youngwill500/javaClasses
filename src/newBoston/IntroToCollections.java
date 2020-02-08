package newBoston;

import java.util.*;

public class IntroToCollections {

	public static void main(String[] args) {

//Create an arrayList
		String[] names = { "Kenny", "Kenwill", "Wilma", "Kennedy" };

//Create an arrayList to store arrays
		List<String> list1 = new ArrayList<String>();

		for (String x : names) {
			list1.add(x);

			
			}
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		
		
		}

	}

}
