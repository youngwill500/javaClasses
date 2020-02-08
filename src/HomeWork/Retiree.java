package HomeWork;

public class Retiree extends Student {
	
	String tour;
	
	void oldMan(String name, String lastName, int grade, String seniorActivity) {
		
		this.name = name;
		this.lastName = lastName;
		this.grade = grade;
		this.tour = seniorActivity;
		
		System.out.println(name+" "+lastName+" "+grade+" "+seniorActivity);
		
	}

	
	
	
	
}
