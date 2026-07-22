package array;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
     int a[]= {10,20,30,40};
     
     System.out.println(a.length);//to calculate length.
     System.out.println(a[2]);//here we print value at index 2.
     System.out.println(a[0]);//here we print value at index 0. 
     
     System.out.println(Arrays.toString(a));//to print entire array
     
    //approach - 1     
     a[1]=88;//for replacing value at index 1.
     System.out.println(Arrays.toString(a));
	

	//approach - 2
	for (int v=0; v<a.length; v++)
	{
		System.out.println(a[v]+"");
	}

	System.out.println();
	//third approach.
	for (int k:a)//syntax for data type new variable:old variable.
	{
		System.out.println(k);
	}
}
}
