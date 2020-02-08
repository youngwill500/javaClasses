package polymorphism;



public class Addition {
	 //method overloading
	// 1 by passing diffeerent amoun of parameters

	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public void add(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}

	//2 by having different types of parameters
	
	public void add(double num1, int num2) {
		System.out.println(num1 + num2);
	}

	public void add(double num1, double num2) {
		System.out.println(num1 + num2);
	}

	
	
	public static void main(String[] args) {

		Addition obj = new Addition();

		obj.add(12, 13);
		obj.add(12, 13, 14);

	}

}
