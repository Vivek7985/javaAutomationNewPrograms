package importantPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] arr = {10, 20, 30, 20, 40, 10, 50};
		
		Set<Integer> set = new HashSet<Integer>();
		
		for (int num : arr) {
			set.add(num);
		}
	
		System.out.println(set);
	}

}
