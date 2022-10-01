package abs;

public abstract class Bike {
	
	int noOfSeats;
	
	public abstract void petrol();  // Abs method
	public void tyre() {  // Non-abs method
		System.out.println("Bike -- Type method");
	}
	
	public abstract void helmet();

}
