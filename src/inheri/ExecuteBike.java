package inheri;

public class ExecuteBike {

	public static void main(String[] args) {
		
		// Inheritance--> It is inheriting the properties of parent class into child class is known as Inheritance.
		// Method Overriding --> When same method is present in Parent class as well as in child class 
		// with same no of parameters is known as Method Overriding.
		
		ShineBike objShineBike = new ShineBike();
		objShineBike.start();
		objShineBike.stop();
		objShineBike.petrol();
		objShineBike.helmet();
		
		Bike objBike = new Bike();
		objBike.start();
		objBike.stop();
		objBike.petrol();
//		objBike.helmet();  not allowed

	}

}
