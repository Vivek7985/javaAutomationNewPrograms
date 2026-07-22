package interface1;

public class UPI implements Payment {

	@Override
	public void pay() {
		System.out.println("Payment using UPI");
	}
}
