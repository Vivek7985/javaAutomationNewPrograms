package interfacePractice2;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
	
	void area() {
		System.out.println("Area Calculated");
	}
}
