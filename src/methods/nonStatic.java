package methods;

public class nonStatic {

	void Demo () {
		System.out.println("Non Static Method");
	}
	public static void main(String[] args) {

		nonStatic obj=new nonStatic();
		
		obj.Demo();
	}

}
