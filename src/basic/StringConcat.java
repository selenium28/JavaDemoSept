package basic;

public class StringConcat {

	public static void main(String[] args) {
		
		int sum = 100;
		int add = 200;
		String test = "100";
		String name = "Java";
		String demo = "Selenium";
		
		System.out.println(sum+add);  // 300
		System.out.println(sum+name+add);  // 100Java200
		System.out.println(sum+add+demo);  // 300Selenium
		System.out.println(demo+add+sum+(add+sum));  // Selenium200100300
		System.out.println(sum+add+name+test+sum); // 100200Java200, 300Java100100
		System.out.println(test+add+sum+name+(test+add));  // 100200100Java100200 

	}

}
