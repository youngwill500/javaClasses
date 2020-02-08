package multiLevelInheritance;

public class test {
	
	public static void main(String[] args) {
	
	Employee emp = new Employee();
	emp.salary = 90000;
	Employee.companyName="Syntax";
	emp.work();
	emp.getPaid();
	
	ScrumMaster emp1 = new ScrumMaster();
	emp1.salary = 100000;
	ScrumMaster.companyName = "Syntax";
	emp1.work();
	emp1.getPaid();
	emp1.coordinateTeam();
	
	
	

}
}