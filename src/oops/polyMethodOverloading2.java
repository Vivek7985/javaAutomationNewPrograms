package oops;

public class polyMethodOverloading2 {

	void show(int num) {
		System.out.println("Integer : " + num);
	}
	
	void show(String name) {
		System.out.println("String : " + name);
	}
	
	
	public static void main(String[] args) {

		polyMethodOverloading2 obj = new polyMethodOverloading2();
		
		obj.show(20);
		obj.show("Vivek");
		
	}

}
