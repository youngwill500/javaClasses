package HomeWork;

public class ReturnMethodPractice {
	
	public int a;
	public int b;
	
	public int output() {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		ReturnMethodPractice obj = new ReturnMethodPractice();
		obj.a = 1;
		obj.b = 2;
		
		int message = obj.output();
		
		System.out.println(message);
		
	}

		

	

}
