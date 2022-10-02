package string;

public class StringClass {

	public static void main(String[] args) {
		
		String city1 = new String("Pune");
		String city2 = new String("Pune");
		
		// == operator is used for reference comparison (address comparison).
		// .equals() --> this method is used for content comparison
		System.out.println(city1==city2);  //
		System.out.println(city1.equals(city2));  // True
		
		String city3 = "Pune";
		String city4 = "Pune";
		System.out.println(city3.equals(city4));   // True
		System.out.println(city3==city4);   // True
		
		String city5 = new String("Pune");
		System.out.println(city4==city5);  // false
		System.out.println(city4.equals(city5)); 
	

	}

}
