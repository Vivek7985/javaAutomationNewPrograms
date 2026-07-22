package oops;

public class Encapsulation {

	
	private int salary;
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public static void main(String[] args) {

		Encapsulation emp = new Encapsulation();
		
		emp.setSalary(50000);
		
		System.out.println(emp.getSalary());
		
	}

}
