package oops;

public class GlobalAndLocalVariables {
	
	static String name = "Dhaval";  // static - Global Variable  --> scope of the global varibles are within the class
	int age = 25;  // non-static Global variable

	public static void main(String[] args) {
		GlobalAndLocalVariables obj = new GlobalAndLocalVariables();
		int a = 50;
		System.out.println("A: "+a);
		System.out.println("Age: " +obj.age);
		System.out.println("Name: "+GlobalAndLocalVariables.name);
		
		obj.sum();
		display();

	}
	
	public void sum() {
		int i = 10;  // local variables, scope of the i is within the method
		int j = 20;
		System.out.println(i+j);
		
	}
	
	public static void display() { 
		int m = 100;
		
		GlobalAndLocalVariables obj2 = new GlobalAndLocalVariables();
		
		System.out.println("Display: "+(obj2.age + m));
		
	}

}
