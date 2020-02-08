package HomeWork;

public class HW120 {
	
	static char getChar(String word, int index) {

		 for(int i = 0; i < word.length(); i++) {
			 
			 word.charAt(i);
		 }

		 return word.charAt(index);
		 
}
	public static void main(String[] args) {
		System.out.println(getChar("hello",1));
	}

}