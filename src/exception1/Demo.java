package exception1;

public class Demo {

	public static void main(String[] args) {

		try {
			
			int result = 10 / 0;
			System.out.println();
			
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide be zero");
		}
		
		System.out.println("Program Continue...");
	}

}
