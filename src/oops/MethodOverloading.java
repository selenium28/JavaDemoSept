package oops;

public class MethodOverloading {

	public static void main(String[] args) {
		
		// MethodOverloading --> When the method name is same with different input parameters within the same class
		// Duplicate methods are not allowed
		// Method inside the methods are not allowed
		// Can we overload the main method? Yes/NO
		// Yes we can overload but we can't do like this because compiler with confused which main method will execute.
		
		MethodOverloading obj = new MethodOverloading();
		MethodOverloading.display();
		obj.display(50);
		obj.display(50, 50);
	}

	public static void main() {
		System.out.println("Second main method");
	}
	
	public static void display() {  // 0 inupt parameters
		System.out.println("0 input parameter");
	}

	public void display(int i) {  // 1 input parameters
		System.out.println("1 input parameter");
	}
	
	public void display(double d) {  // 1 input parameters but datatype is different
		System.out.println("1 input parameter");
	}

	public void display(int m, int n) {  // 2 input parameters
		System.out.println("2 input parameter");
	}


}
