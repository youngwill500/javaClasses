package review11;

public class Main implements MyInterface {

	public void m1() {

		System.out.println("implementation of method1");

	}

	public void m2() {

		System.out.println("implementation of method2");

	}

	public static void main(String[] args) {

		Main obj = new Main();
		obj.m1();
		obj.m2();

	}

}