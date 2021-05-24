package com.corejava.OOPs.Arrays;

//In Arrays class there are two methods that copy an array fully or partially.
//copyOf() method
import java.util.Arrays;

public class ArraysCopyOfMethod 
{
	public static void main(String[] args)
	{

		String[] x = {"one", "two", "three", "four", "five"};
		String[] y = Arrays.copyOf(x, x.length);
		String[] z = Arrays.copyOf(x, 3); //will copy the 3 first elements of array x
		String[] z1 = Arrays.copyOf(x, 2);
		
		System.out.println("Array x: " + Arrays.toString(x));
		System.out.println("Array y: " + Arrays.toString(y));
		System.out.println("Array z: " + Arrays.toString(z));
		System.out.println("Array z: " + Arrays.toString(z1));

	}

}
