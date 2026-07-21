package operators;

public class logical {

	public static void main(String[] args) {

		int age = 25;
		boolean hasID = true;
		
		System.out.println(age >=18 && hasID);
		System.out.println(age < 18 || hasID);
		System.out.println(!hasID);
	}

}
