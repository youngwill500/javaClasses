
public class Class17recap {

	// Build a school

	int students, teachers, classRooms;
	String name, address, website;

	void study() {
		System.out.println("Students studying at " + name);
	}

	void teach() {
		System.out.println("Teachers teaching at " + name);
	}

	public static void main(String[] args) {

		Class17recap school = new Class17recap();
														//Variables defined within a class are called class members
		school.name = "Syntax";
		school.students = 200;

		Class17recap school1 = new Class17recap();

		school1.name = "Pinnacle";
		school1.students = 150;

		school1.teach();
		school.study();

	}

}
