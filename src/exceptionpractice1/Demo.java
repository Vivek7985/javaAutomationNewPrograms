package exceptionpractice1;

public class Demo {

	public static void main(String[] args) {

		try {
			String name = null;
			
			System.out.println(name.length());
		
		} catch (NullPointerException e) {
			System.out.println("String is null.");
		}
		
		System.out.println("Program Ended.");
	}

}
