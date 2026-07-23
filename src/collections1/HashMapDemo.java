package collections1;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		// creating HashMap
		Map<String, String> employee = new HashMap<>();
		
		// 1. put()
		employee.put("101", "Vivek");
		employee.put("102", "Rahul");
		employee.put("103", "Amit");
		employee.put("104", "Sagar");
		
		System.out.println("Oiginal Map : " + employee);
		
		// 2. get()
	    System.out.println("Employee 101 : " + employee.get("102"));
	    
	    // 3. containsKey()
	    System.out.println("Contains Key 103 : " + employee.containsKey("103"));
	    
	    // 4. containsValue()
	    System.out.println("Contains Vivek : " + employee.containsValue("Vivek"));
	    
	    // 5. size()
	    System.out.println("Size : " + employee.size());
	    
	    // 6. replace()
	    employee.replace("104", "Rohit");//replace Sagar by Rohit here
	    System.out.println("After replace : " + employee);
	   
	    // 7. remove()
	    employee.remove("103");
	    System.out.println("After Remove : " + employee);
	    
	    // 8. keySet()
	    System.out.println("\nKeys");
	    
	    for (String key : employee.keySet()) {
	    	System.out.println(key);
	    }
	    
	    // 9. values()
	    System.out.println("\nValues");
	    
	    for (String value : employee.values()) {
	    	System.out.println(value);
	    }
	    
	    // 10. Entry Set (Most Important)
	    System.out.println("\nKey & Value");
	    
	    for (Map.Entry<String, String> entry : employee.entrySet()) {
	    	System.out.println(entry.getKey() + "-->" + entry.getValue());
	    }
	    
	    // 11. clear()
	    employee.clear();
	    
	    System.out.println("\nAfter Clear : " + employee);
	    
	    // 12. isEmpty()
	    System.out.println("Is Empty : " + employee.isEmpty());
	
	}
	

}
