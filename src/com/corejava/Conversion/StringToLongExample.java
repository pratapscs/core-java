package com.corejava.Conversion;

/* String to long in java using Long.parseLong() method.
 * 
 * Scenario:
 * It is generally used if we have to perform mathematical operations on 
 * the string that contains long number. Whenever we get data from textfield 
 * or textarea, entered data is received as a string. If entered data is long, 
 * we need to convert string to long. To do so, we use Long.parseLong() method.
 * 
 */
public class StringToLongExample 
{
	public static void main(String args[])
	{  
		String s="8867527402";  
		long l=Long.parseLong(s);  
		System.out.println(l);  
		}
}
