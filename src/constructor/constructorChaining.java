package constructor;

public class constructorChaining {

	public constructorChaining() {
          this (100);
          System.out.println("Default");
	}
	
	constructorChaining(int id) {
		this(id, "Vivek");
		System.out.println(id);
	}
	
	constructorChaining(int id, String name){
		System.out.println(id + " " +name);
	}
	
	public static void main(String[] args) {
         
		new constructorChaining();
	}

}
