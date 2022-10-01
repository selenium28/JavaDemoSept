package inter;

public class RunBank {

	public static void main(String[] args) {
		
		AxisBank objAxisBank = new AxisBank();
		objAxisBank.accountNo();
		objAxisBank.atmCard();
		objAxisBank.ccCard();
		
		Bank b = new AxisBank();   // dynamic polymorphism
		b.accountNo();
		b.atmCard();
		b.ccCard();
		b.rateOfIntrest();

	}

}
