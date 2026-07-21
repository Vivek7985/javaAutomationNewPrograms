package constructor;

public class construct {

	int id;
	String name;
	
	construct() {
		id = 101;
		name = "Vivek";
	}
	public static void main(String[] args) {
             
		construct S1=new construct();
		
		System.out.println(S1.id);
		System.out.println(S1.name);
		
	}

}
