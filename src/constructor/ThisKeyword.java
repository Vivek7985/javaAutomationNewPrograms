package constructor;

public class ThisKeyword {

	ThisKeyword(){
		this(101);
		System.out.println("default");
		
	}
	
	ThisKeyword (int id){
		System.out.println("ID = " + id);
	}
	
	
	public static void main(String[] args) {
	
		new ThisKeyword();

	}

}
