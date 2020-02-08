package HomeWork;

public class Student extends Person {
	
	int grade;
	
	void school(String name, String lastName, int age, int grade) {
		
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.grade = grade;
		
		System.out.println(name+" "+lastName+" "+age+" "+grade);
		
		
	}
	

}
