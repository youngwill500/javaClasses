package HomeWork;

public class carTest {

	public static void main(String[] args) {
		
		Car car1 = new Car("Toyota","Prius", 4, 120, 30000);
		Car car2 = new Car("Toyota","Prius", 120, 30000);
		Car car3 = new Car(4, 120, 30000);
		Car car4 = new Car("Toyota", "Prius", 4);
		
		car1.Display();
		car2.Display();
		car3.Display();
		car4.Display();
	}

}
