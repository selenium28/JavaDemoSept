package basic;

public class ArrayConcept {

	public static void main(String[] args) {
		
		// Array: To store  similar datatype values in array variable.
		// Array index starting from zero
		// size n: n-1; ex: 4-1 = 3 (n is a size of array)
		
//		int i = 10;
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 33;
		i[3] = 40;
//		i[4] = 50;
		
//		System.out.println(i[1]);
//		System.out.println(i[2]);
		System.out.println(i[4]);  // ArrayIndexOutOfBoundsException
		
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		
		double d[] = new double[4];
		d[0] = 100.44;
		d[1] = 33.33;
	}

}
