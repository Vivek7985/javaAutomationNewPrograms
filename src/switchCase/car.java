package switchCase;

public class car {

	public static void main(String[] args) {

		int PRICE=1500000;
		
		switch (PRICE) {
		case 500000:
		System.out.println("Regular Car");
		break;
		
		case 1000000:
		System.out.println("Mini SUV");
		break;
		
		case 1500000:
		System.out.println("Micro SUV");
		break;
	
		case 2000000:
		System.out.println("SUV");
		break;
	
		default:
			System.out.println("Congrats For Your New Car");
			break;
		}
	}
}
