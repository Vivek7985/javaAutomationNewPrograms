package superKeyword1;

public class Child extends Parent {

	int x = 20;
	
	void display() {
		System.out.println("Child x = " + x);
		System.out.println("Parent X = " + super.x);
	}
}
