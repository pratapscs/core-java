package com.corejava.OOPs.Array;

//How to copy an Array in Java?
import java.util.Arrays;

public class HowNOTtoCopyAnArray 
{
	public static void main(String[] args)
	{
		/* Arrays inherit methods from Object class, and clone is one of them. 
		 * If you need to copy an Array as it is then this is the method you should use.
		 */

		int[] x = {1, 2, 3, 4, 5};
		int[] y = x; //don't copy array like this!

		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y)+"\n");

		x[1] = 22; // y[1] will display 22! same reference

		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y)+"\n");

		y[4] = 55; // x[4] will display 55!

		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));

	}

}
