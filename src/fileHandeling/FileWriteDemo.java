package fileHandeling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

	public static void main(String[] args) {

		try {
			
			FileWriter writer = new FileWriter("sample.txt");
			
					writer.write("Hello Vivek\n");
			 		writer.write("Welcome to Java File Handling");

			 		writer.close();
			 		
			 		System.out.println("File Written Successfully.");
		
		} catch (IOException e) {
 
			System.out.println(e.getMessage());
		}
	}

}
