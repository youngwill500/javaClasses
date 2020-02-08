package polymorphism;

public class TwoMain {

	private void same() {
		System.out.println("private m1 method");
	}
	
	private void same(int num1) {
		System.out.println("private m1 method with int parameter");
	}
	
	public static void main(String[] args) {
		
		TwoMain obj = new TwoMain();
		
		obj.same();
		obj.same(1);
		
		
	}
	
	
	

}
