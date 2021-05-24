package com.corejava.OOPs.Arrays;

import java.util.Arrays;

/* With System.arraycopy() you can control the range of elements from the source 
 * array that you want to copy,and the destined position.
 * 
 * arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 */
public class SystemArrayCopy
{
	
	public static void main(String[] args){

		String[] x = {"one", "two", "three", "four", "five"};
		String[] y = new String[2];
		System.arraycopy(x, 3, y, 0, 2);

		System.out.println("Array x: " + Arrays.toString(x));
		System.out.println("Array y: " + Arrays.toString(y) + "\n");

		Object[] z = new Object[5];
		System.arraycopy(x, 0, z, 0, 5);
		System.out.println("Array z: " + Arrays.toString(z)+"\n");

		Integer[] w = {3, 4, 5};
		System.out.println("Array w: " + Arrays.toString(w));

		//copy from the second value (1) of array w to z and place in the fourth place (3) the 2 values
		System.arraycopy(w, 1, z, 3, 2);
		System.out.println("Array z: " + Arrays.toString(z));

	}
}
