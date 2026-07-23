package importantPrograms;

import java.util.HashMap;
import java.util.Map;import automaticPromotion.char2Int;

public class DuplicateCharacters {

	public static void main(String[] args) {

		String str = "programming";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (char ch : str.toCharArray()) {
			
			map.put(ch, map.getOrDefault(ch, 0) + 1);
			
		}
		
		System.out.println("Duplicate CHaracters:");
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			
			if (entry.getValue() > 1) {
				
				System.out.println(entry.getKey() + " = " + entry.getValue());
			}
		}
	}

}
