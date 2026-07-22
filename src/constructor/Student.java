package constructor;

public class Student {
//Parameterized Method
	int id;
	String name;
	
	public Student(int i, String n) {
		
		id = i;
		name = n;
	}
	
	public static void main(String[] args) {

		Student s1 = new Student(101, "vivek");
		
		System.out.println(s1.id);
		System.out.println(s1. name);
	}

}
