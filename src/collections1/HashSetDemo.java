package collections1;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {

	    // Creating Hashset
		Set<String> names = new HashSet<>();
		
		// 1. add()
		names.add("Vivek");
		names.add("Rahul");
		names.add("Amit");
		names.add("Sagar");
		names.add("Rahul"); // Duplicate
		names.add("Vivek"); // Duplicate
		
		System.out.println("Original Set : " + names);
	
		// 2. Size()
		System.out.println("Size : " + names.size());
		
		// 3. contains()
		System.out.println("Contains Rahul : " + names.contains("Rahul"));
		System.out.println("Contains Mohan : " + names.contains("Mohan"));
		
		// 4. remove()
		names.remove("Amit");
		
		System.out.println("After Removing Amit : " + names);
		
		// 5. isEmpty
		System.out.println("Is Empty : " + names.isEmpty());
		
		// 6. Enhanced For Loop
		System.out.println("\nPrinting Elements");
		
		for (String name : names) {
			System.out.println(name);
		}
		
		// 7. clear()
		names.clear();
		
		System.out.println("\nAfter Clear : " + names);
		
		// 8. isEmpty() after clear
		System.out.println("Is Empty Now : " + names.isEmpty());
	}

}
