package interface3;

public class SmartPhone implements Camera, Callable {

	@Override
	public void takePhoto() {
		System.out.println("Photo Captured");
	}
	
	@Override
	public void makeCall() {
		System.out.println("Calling...");
	}
}
