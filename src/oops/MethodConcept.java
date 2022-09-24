package oops;

public class MethodConcept {

	public static void main(String[] args) {
		
		// one object will be created, obj is ref. variable
		// Once you created the object all the non-static methods will be given to that object.
		// method inside the method is not allowed
		
		MethodConcept obj = new MethodConcept();
		obj.test();
		int c = obj.sum();
		System.out.println(c);
		int d = obj.add(50, 100);
		System.out.println(d);
	}
	
	// void --> dosen't return any value
	// return type --> void 
	public void test() {
		System.out.println("No input and No out put");
	}
	
	// return type --> int 
	public int sum() {
		System.out.println("No input and some output");
		int a = 10;
		int b = 20;
		int c = a+b;
	
		return c;
	}
	// return type --> int
	public int add(int m,int n) {
		System.out.println("Add: some input and some output");
		int k = m+n;
		return k;
	}
	
	
}
