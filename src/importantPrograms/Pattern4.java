package importantPrograms;

public class Pattern4 {

	public static void main(String[] args) {

		//alphabets vertical
		for (int i = 1; i <=5; i++) {
			
			for (char ch = 'A'; ch < 'A' + i; ch++) {
				
				System.out.print(ch);

			}
			
			System.out.println();
		}
	}

}
