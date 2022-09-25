package encap;

public class ConstructorClass {

	public static void main(String[] args) {
		
		// Constructor name must be same as class name
		// Constructor doesn't have return type
		// We can use as public, private, protected in Constructor
		// keyword - static,abstarct and final -->
		// error: Illegal modifier for the constructor in type ConstructorClass; only public, protected & private are permitted
		
		
		ConstructorClass obj = new ConstructorClass();
		System.out.println("I'm in main method");
		
	}
	
	ConstructorClass(){
		System.out.println("I'm in Constructor block");
	}

}
