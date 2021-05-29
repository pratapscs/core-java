package com.corejava.OOPs.Array;

import java.util.Arrays;

public class ArraysCopyOfRange 
{
	public static void main(String[] args)
	{
		String[] x = {"one", "two", "three", "four", "five"};
		String[] y = Arrays.copyOfRange(x, 0, x.length); //full copy of the array
		String[] z = Arrays.copyOfRange(x, x.length-2, x.length); //copy only the last 2 elements


		System.out.println("Array x: " + Arrays.toString(x));
		System.out.println("Array y: " + Arrays.toString(y));
		System.out.println("Array z: " + Arrays.toString(z));
	}

}
