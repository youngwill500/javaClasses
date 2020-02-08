package methodOverriding;

public class FullTime extends Employee {

	int bonus;
	
	public void getPaid() {
		System.out.println("Full time employee gets paid "+salary+" and bonus of "+bonus);
	}
	
	
}
