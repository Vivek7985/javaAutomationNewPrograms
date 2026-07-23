package collections1;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
	
         //List & Array list
	public static void main(String[] args) {

		//creating list
		List<String> names = new ArrayList<>();
		
		// 1. add()
		names.add("Vivek");
		names.add("Rahul");
		names.add("Amit");
		names.add("Sagar");
		names.add("Rahul"); //Duplicate allowed
		
		System.out.println("Original List : " + names);
		
	    // 2. get()
		System.out.println("First Element : " + names.get(0));
		System.out.println("Third Element : " + names.get(2));
		
		// 3. Size()
		System.out.println("List Size : " + names.size());
		
		// 4. contains()
		System.out.println("Contains Rahul? : " + names.contains("Rahul"));
		System.out.println("Contains Mohan? : " + names.contains("Mohan") );
		
		// 5. remove by object
		names.remove("Amit");
		System.out.println("After Removing Amit : " + names);
		
		
		// 6. remove() by Index
		names.remove(1);
		System.out.println("After Removing Index 1: " + names);
		
		// 7. isEmpty()
        System.out.println("Is List Empty? " + names.isEmpty());	
        
        // 8. set() - Update Element
        names.set(1, "Rohit");
        System.out.println("After Updating : " + names);
        
        // 9. indexOf()
        System.out.println("Index of Rahul : " + names.indexOf("Rahul"));
        
        // 10. lastsindexOf()
        names.add("Rahul");
        System.out.println("Updated List : " + names);
        System.out.println("Last Index of Rahul : " + names.lastIndexOf("Rahul"));
        
        // 11.  for-each Loop
        System.out.println("\nUsing Enhanced For Loop");
        for (String name : names) {
        	System.out.println(name);
        }	
        
        // 12. clear()
        names.clear();
        System.out.println("\nAfter Clear : " + names);
        
        // 13. isEmpty() after clear
        System.out.println("Is List Empty Now? : " + names.isEmpty());
        
	}

}
 