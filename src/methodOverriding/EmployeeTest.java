package methodOverriding;

public class EmployeeTest {

	public static void main(String[] args) {
	
		Employee emp = new Employee();
		emp.salary = 80000;
		emp.getPaid();
		
		FullTime ft = new FullTime();
		ft.salary = 90000;
		ft.bonus = 10000;
		ft.getPaid();
		

	}

}
