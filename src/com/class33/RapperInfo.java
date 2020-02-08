package com.class33;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class RapperInfo {

	public static void main(String[] args) {
		
		List<RapperNames> rlist = new ArrayList<>();
		
		rlist.add(new RapperNames("Jcole","DreamVille"));
		rlist.add(new RapperNames("Kanye","GOOD"));
		rlist.add(new RapperNames("Cudi","GOOD"));
		
		for(RapperNames i:rlist) {
			System.out.println(i.name);
			System.out.println(i.label);
			//i.display();
		}
		
		
		Iterator<RapperNames> RapperIterator = rlist.iterator();
		
		while(RapperIterator.hasNext()) {
			RapperIterator.next().display();
		}
		
		
		
		

	}

}
