package DataTypeLimits;

public class dataTypeLimits {

	public static void main(String[] args) {

		System.out.println("======================Java Primitive Data Type Limits====================\n");
		
		System.out.printf("%-10s %-25s %-30s%n", "Data Type", "Minimum Value", "Maximum Value");
		System.out.println("----------------------------------------------------");
		
		System.out.printf("%-10s %-25s %-30s%n", "byte", Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.printf("%-10s %-25s %-30s%n", "short", Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf("%-10s %-25s %-30s%n", "int", Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf("%-10s %-25s %-30s%n", "long", Long.MIN_VALUE, Long.MAX_VALUE);
		System.out.printf("%-10s %-25s %-30s%n", "float", Float.MIN_VALUE, Float.MAX_VALUE);
		System.out.printf("%-10s %-25s %-30s%n", "double", Double.MIN_VALUE, Double.MAX_VALUE);
		System.out.printf("%-10s %-25s %-30s%n", "char", (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
		System.out.printf("%-10s %-25s %-30s%n", "boolean", "false", "true");
	}

}
