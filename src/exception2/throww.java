package exception2;

public class throww {

	public static void main(String[] args) {

		int age = 15;
		 
		if (age < 18) {
			 
			 throw new ArithmeticException("Not Eligible to vote");
		 }
		
		System.out.println("Eligible");
	}

}
