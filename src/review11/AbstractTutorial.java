package review11;


  abstract class Dog {
	  
	public void bark() {
		System.out.println("Bark");
	}
	
	public abstract void poop();
	
 }
  
 class Bulldog extends Dog {
	
	 public void poop() {
		 System.out.println("Bulldog pooped");
	 }
	 
 }


public class AbstractTutorial {

	public static void main(String[] args) {
		
		Bulldog obj = new Bulldog();
		
		obj.bark();
		obj.poop();
		
	

	}

}
