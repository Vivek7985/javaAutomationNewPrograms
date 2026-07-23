package importantPrograms;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

	public static void main(String[] args) {

		String str = "automation";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (char ch : str.toCharArray()) {
			
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		
		System.out.println(map);
	}

}
