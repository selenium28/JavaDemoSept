package encap;

public class ConstructorDemo {
	// Execution Sequence: 
	// Static --> main method --> Block --> (main method)- Object Creation--> Automatically calls the constructor --> methods
	
	{
		System.out.println("1st Blank Block");
	}
	
	{
		System.out.println("2nd Blank Block");
	}

	public static void main(String[] args) {
		
		System.out.println("Main method");
		ConstructorDemo obj = new ConstructorDemo();
		obj.add();
	} 
	
	void add() {
		System.out.println("I'm in Add");
	}
	
	ConstructorDemo(){
		System.out.println("I'm in ConstructorDemo");
	}
	
	static
	{
		System.out.println("I'm in static block");
	}

}
