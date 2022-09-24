package oops;

public class StaticAndNonStatic {

	public static void main(String[] args) {
		System.out.println("Main method");
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.test();
		obj.demo();
		display();
		StaticAndNonStatic.sample();
	}
	
	public static void display() {
		System.out.println("Display method - static method");
	}
	
	public void demo() {
		System.out.println("Demo method - non-static method");
	}
	
	public void test() {
		System.out.println("Test method - non-static method");
	}
	
	public static void sample() {
		System.out.println("Sample method - static method");
	}
	

}
