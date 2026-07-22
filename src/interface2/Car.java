package interface2;

public class Car implements Vehicle{

	@Override
	public void start() {
		System.out.println("Car Started");
	}
	
	
	void openSunroof() {
		System.out.println("Sunroof Opened");
	}
}
