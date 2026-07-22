package importantPrograms;

public class employee {

	int id;
	String name;
	double salary;
	
	void display () {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	
	public static void main(String[] args) {

		employee e1 = new employee();
		
		e1.id = 1;
		e1.name = "Vivek";
		e1.salary = 5000;
		
		e1.display();
	}

}
