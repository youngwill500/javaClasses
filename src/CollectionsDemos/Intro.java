package CollectionsDemos;

import java.util.*;

public class Intro {

	public static void main(String[] args) {

		String[] things = { "eggs", "lasers", "hats", "pie" };
		List<String> list = new ArrayList<>();

		// add array items to list
		for (String x : things)
			list.add(x);

		String[] morethings = { "lasers", "hats" };
		List<String> list2 = new ArrayList<>();

		// add array items to list
		for (String y : morethings)
			list2.add(y);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
