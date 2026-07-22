package exception2;

import java.io.IOException;

public class throwss {

	static void display() throws IOException {
		
		throw new IOException("File Error");
	}
	
	public static void main(String[] args) {
		
		try {
			
			display();
		
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
	}
	

}
