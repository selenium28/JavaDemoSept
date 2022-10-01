package inter;

public interface Bank {
	
	// 100% abs
	// No method body
	// we can't create object of interface
	// Always define only abs methods
	
	public void rateOfIntrest();
	public void accountNo();
	public void atmCard();
	
	default void ccCard() {
		System.out.println("Default --- Bank-- ccCard");
	}

	// Webdriver - interface  -- chromeBrowser, FirefoxBrowser etc
	
}
