package HomeWork;

public class Employee extends Person{

	int salary;
	
	void job(String name, String lastName, int age, int salary) {
		
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		
		System.out.println(name+" "+lastName+" "+age+" "+salary);
		
		
	}
	
	
}
