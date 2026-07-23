package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Demo {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("vivek", "rahul", "amit", "sagar");
		
		// 1. forEach() wuth Lambda
		System.out.println("Names");
		names.forEach(name -> System.out.println(name));
		
		// 2. Method Reference
		System.out.println("\nMethod Reference:");
		names.forEach(System.out::println);
		
		// 3. filter()
		System.out.println("\nNames starting with 'a':");
		names.stream()
		     .filter(name -> name.startsWith("a"))
		     .forEach(System.out::println);
	
		// 4. map()
		System.out.println("\nNames starting with 'a' :");
		names.stream()
		     .map(String::toUpperCase)
		     .forEach(System.out::println);
		
		// 5. collect()
		List<String> upperNames = names.stream()
		                               .map(String::toUpperCase)
		                               .collect(Collectors.toList());
		
		System.out.println("\nCollected List:");
		System.out.println(upperNames);
	}
}
;