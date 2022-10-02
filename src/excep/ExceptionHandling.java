package excep;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int b = 10;
		int a[] = new int[4];
		
		// An Exception is an issue (run time error) occured during the excution of a program.
		// Can we use multiple blocks ---> No
		// Can a try block have multiple catch blocks? ---> Yes
		
//		try {
//			a[3] = 10/0;
//			
//			System.out.println(a[4]);
//		} catch (ArithmeticException e) {
//			System.out.println("ArithmeticException");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("ArrayIndexOutOfBoundsException");
//		} catch (Exception e) {
//			System.out.println("Normal Exception");
//		}
//		
		
		System.out.println("Rest of code");
		
		
		try {
			System.out.println(a[5]);
		} finally {
			System.out.println("Rest of code in Finally block");
		}

	}

}
