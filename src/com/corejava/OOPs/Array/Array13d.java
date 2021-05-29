package com.corejava.OOPs.Array;

/* 13.what are the exceptions associated with arrays?
 *  java.lang.ArrayStoreException  
 *  
 *  Whenever you see this exception, it means that you have been storing a
 *  wrong kind of data type in an array. One thing that may solve this,
 *  is the usage of the proper type, or even casting to the proper type.
 */
public class Array13d 
{
	@SuppressWarnings("unused")
	
	public static void main(String... args) {
		/* I created an Integer array and tried to put 4.4 as its first element.
		 * While this is a non-sense (4.4 is not an integer)
		 */
		
		//Object[] s = new Integer[4];
		//s[0] = 4.4;
		
		
		/* the array is an array of Object, and 4.4 is an object. 
		 * In the second case, we explicitly say that the array is an array of 
		 * Integer objects, and 4.4 is not an instance of Integer, hence the error.
		 */
		Integer[] s1= new Integer[4];
	//	s1[0] = 4.4;
	}


}
