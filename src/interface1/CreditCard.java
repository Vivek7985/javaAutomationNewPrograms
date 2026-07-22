package interface1;

public class CreditCard implements Payment {

	@Override
	public void pay() {
		System.err.println("Payment using Credit Card");
		
	}
}