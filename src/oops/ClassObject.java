package oops;

public class ClassObject {

	public static void main(String[] args) {
		
		// ClassObject - Class name
		// obj - Reference variable
		// new - keyword
		// ClassObject() - constructor
		// new ClassObject(); - object
		
		ClassObject obj = new ClassObject();
		obj.sleep();
		obj.eat();
		System.out.println("Main method");
	}
	
	public void sleep() {
		System.out.println("Sleep Method");
		
	}
	
	public void eat() {
		System.out.println("Eat Method");
	}
	
	

}
