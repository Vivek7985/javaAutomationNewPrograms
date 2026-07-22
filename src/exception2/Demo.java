package exception2;

public class Demo {

	public static void main(String[] args) {

		try {
			int result = 10 / 0;
			System.out.println(result);
		
		} catch (ArithmeticException e) {
			
			System.out.println("Cannot divide be zero");
		
		} finally {
			
			System.out.println("Finally Block Executed");
		}
		
	}

}
