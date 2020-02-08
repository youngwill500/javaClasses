package HomeWork;

public class HW123 {

	public static String makeThreeSubstr(String word, int startIndex, int endIndex) {

		String str = "";   // <------------------

		for (int i = 0; i < 3; i++) {
			str = str + word.substring(startIndex, endIndex);
		}

		return str;

	}
	
	
	public static void main(String[] args) {
	
		System.out.print(makeThreeSubstr("hello",0,2));
		System.out.println();
		System.out.println(makeThreeSubstr("shenanigans",3,7));
		
		Main mm = new Main();
		
		
		
	}

}
