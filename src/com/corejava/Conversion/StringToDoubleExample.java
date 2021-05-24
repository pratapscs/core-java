package com.corejava.Conversion;

/* String to double in java using Double.parseDouble() method.
 * 
 * Scenario:
 * It is generally used if we have to perform mathematical operations on 
 * the string that contains double number. Whenever we get data from textfield 
 * or textarea, entered data is received as a string. If entered data is double,
 * we need to convert string to double. To do so, we use Double.parseDouble() method. 
 * 
 */
public class StringToDoubleExample 
{
	@SuppressWarnings("unused")
	public static void main(String args[])
	{  
		String s="23.6";  
		double d=Double.parseDouble("23.6");  
		System.out.println(d);  
		}

}
