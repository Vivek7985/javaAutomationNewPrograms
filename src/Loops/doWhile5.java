package Loops;


import java.util.Scanner;

public class doWhile5 {

	public static void main(String[] args) {

		//User Menu real world example
		Scanner sc=new Scanner(System.in);
		
		int choice;
		
		do {
			System.out.println("1. Login");
			System.out.println("2. Register");
			System.out.println("3. Exit");
			System.out.println("Wnter your choise: ");
			
			choice= sc.nextInt();
			
			System.out.println("You Selected: " + choice);
		} while (choice !=3);
		System.out.println("Program Ended");
		sc.close();
		
	}

}
