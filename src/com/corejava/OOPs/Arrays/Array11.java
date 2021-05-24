package com.corejava.OOPs.Arrays;

/*11.what is the advantage of of jagged array data structure?
 *  
 *  array of array
 *  
 *  This is like a 2D array but with irregular subarray lengths. 
 *  Its lengths are not even—they are jagged. Here we create a jagged array of two 
 *  String arrays.
 */
public class Array11
{
	public static void main(String[] args) 
	
	{

		// Create an array of String arrays: a jagged array.
		String[][] values = new String[2][];

		// Fill first row with 2-element array.
		values[0] = new String[2];
		values[0][0] = "cat";
		values[0][1] = "dog";

		// Use 3-element array for second row.
		values[1] = new String[3];
		values[1][0] = "fish";
		values[1][1] = "bird";
		values[1][2] = "lizard";

		// Display rows and elements.
		for (String[] array : values) {
		    for (String element : array) {
			System.out.print(element);
			System.out.print(" ");
		    }
		    System.out.println();
		}
	    }

}
