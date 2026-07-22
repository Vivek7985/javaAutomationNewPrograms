package importantPrograms;

public class bankAccount {

	String accountholder;
	double balance;
	
	void deposit(double amount) {
		balance = balance + amount;
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
	}
	
	void display() {
		System.out.println(accountholder);
		System.out.println(balance);
	}
	
	public static void main(String[] args) {

		bankAccount acc = new bankAccount();
		
		acc.accountholder = "Vivek";
		
		acc.deposit(10000);
		
		acc.withdraw(2500);
		
		acc.display();
		
	}

}
