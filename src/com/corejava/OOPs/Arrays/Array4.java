package com.corejava.OOPs.Arrays;

/*4.Who creates arrays in java and where?
 * 
 * 
 */
public class Array4 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		 //For primitive types:

		int[] myIntArray = new int[3];
		int[] myIntArray1 = {1,2,3};
		int[] myIntArray2= new int[]{1,2,3};
		
		//For classes, for example String, it's the same:

		String[] myStringArray = new String[3];
		String[] myStringArray1 = {"a","b","c"};
		String[] myStringArray2= new String[]{"a","b","c"};

	}
	   
}
