package com.corejava.OOPs.Arrays;

/* Arrays which have elements that are objects are somewhat tricky. 
 * The programmer must create both the array, and each element.
 * This is due to the fact that each element of the array is a reference
 * to a Person, not the Person itself.
 */

public class Array12
{
	@SuppressWarnings("unused")
	private static String name;

	
	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		Array12[] personArray;  // declares a variable 'personArray' of type Array12 array.

		personArray = new Array12[5];  // creates slots to hold five persons. No Person is created yet.

		for (int i=0;i<5;i++)
		{
		    personArray[i]= new Array12();  // create each actual Array12
		}

		System.out.println(personArray[0].name="Joe1");
		System.out.println(personArray[1].name="Joe2");
		System.out.println(personArray[2].name="Joe3");
		System.out.println(personArray[3].name="Joe4");
		System.out.println(personArray[4].name="Joe5");
	//	System.out.println(personArray[5].name="Joe6");
		
	}

}
