package review11;

public class Human {
	
	String name;
	int age;
	int weight;
	
	Human(String name) {
		//super();
		this.name = name;		
	}
	Human() {
		System.out.println("A human being is created.");
	}
	
	
	Human(String name, int age, int weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public String greeting() {
		return "Hello";
	}
	
	
	public void talk() {
		System.out.println("Kak dilla");
	}
	
}
