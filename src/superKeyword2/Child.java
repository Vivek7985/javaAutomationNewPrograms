package superKeyword2;

public class Child extends Parent {

	void show() {
		System.out.println("Child Method");
	}
	
	void display() {
		show();
		super.show();
	}
}
