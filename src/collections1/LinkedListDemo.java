package collections1;

import java.util.LinkedList;

public class LinkedListDemo {

	/*Linked list
	 * ArrayList = Fast Read
       LinkedList = Fast Insert/Delete
	 */
	
	public static void main(String[] args) {

		LinkedList<String> cities = new LinkedList<>();
		
		// 1. add()
		cities.add("Pune");
		cities.add("Mumbai");
		cities.add("Nashik");
		cities.add("Nagpur");
		
		System.out.println("Original List : " + cities);
		
		// 2. addFirst()
		cities.addFirst("Delhi");
		
		// 3. addLast()
		cities.addLast("Hyderabad");
		
		System.out.println("After addFirst & addLast : " + cities);
		
		// 4. getFirst
		System.out.println("First City : " + cities.getFirst());
		
		// 5. getLast()
		System.out.println("Last City : " + cities.getLast());
		
		// 6. remoFirst()
        cities.removeFirst();
        
        // 7. removeLast()
        cities.removeLast();
        
        System.out.println("After removeFirst & removeLast : " + cities);
        
        
        // 8 . contains()
        System.out.println("Contains Pune : " + cities.element().contains("Pune"));
        
        
        // 9. size()
        System.out.println("Size : " + cities.size());
        
        // 10. set ()
        cities.set(1, "Sambhajinagar");
        System.out.println("After Update : " + cities);
        
        // 11. for-each loop
        System.out.println("\nCities List");
        
        for (String city : cities) {
        	System.out.println(city);
        }
        
        // 12. clear()
        cities.clear();
        
        System.out.println("\nAfter Clear : " + cities);
        
       
        
        
	}

}
