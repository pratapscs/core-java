package com.JUnit;

import static org.junit.Assert.assertEquals;

/* assertEquals()  - Method compares the two objects for equality.
 * 
 * assertEquals() method internally uses the equals() method to determine equality 
 * of the passed objects in the method.
 *  
 */
public class AssertionsEqualExample 
{
	 public static void main(String args[]) 
	 {
	        String str1 = new String("ab");
	        String str2 = new String("ab");
	 
	        assertEquals(str1, str2);
	        
	        System.out.println("after assertEquals");        
	    }

}
