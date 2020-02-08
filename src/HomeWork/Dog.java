package HomeWork;

public class Dog {
	
	String dogName;
	double dogWeight;   
	static String dogBreed = "Mutt";
	
	Dog(String nombre, double weight, String breed) {
		dogName = nombre;
		dogWeight = weight;
		breed = dogBreed;
		
		System.out.println(dogName+" "+dogBreed+" "+dogWeight);
	}
	
	Dog(String namee, double weight) {
		
		dogName = namee;
		dogWeight = weight;
		
		System.out.println(dogName+" "+dogBreed+" "+dogWeight);
	}
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Tarzan", 50.0, "breed"); 
		Dog dog2 = new Dog("Tarzan", 50.0);
		
	}
	

}
