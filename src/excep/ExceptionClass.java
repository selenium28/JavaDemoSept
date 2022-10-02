package excep;

public class ExceptionClass {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			System.out.println("Exception Handle");
			e.printStackTrace();
			System.out.println(e.toString());
			
		}
		
		// rest of code
		System.out.println("Login");
		System.out.println("Dashboard");

	}

}
