package Loops;

public class doWhile4 {

	public static void main(String[] args) {
//execute at lease once
		int i=10;
		do {
			System.out.println("Hello");
		} while (i<5);
	}
}

//The condition i < 5 is false, but the do block executes once before the condition is checked.