package com.corejava.OOPs.Array;

import java.util.Arrays;

public class CloneArray 
{
	public static void main(String[] args){

		int[] x = {1, 2, 3, 4, 5};
		int[] y = x.clone();

		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y)+"\n");

		x[1] = 22;

		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y)+"\n");

		y[4] = 55;

		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));

	}

}
