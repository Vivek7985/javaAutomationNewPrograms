package constructor;

public class constructorOverloading {

	public constructorOverloading() {
		System.out.println("Default");
	}
	
	constructorOverloading(int id){
		System.out.println("ID = " + id);
	}
	
	constructorOverloading (int id, String name) {
		System.out.println(id + " " + name);
	}
	
	public static void main(String[] args) {

		new constructorOverloading();
		new constructorOverloading(101);
		new constructorOverloading(101, "Vivek");
	}

}
