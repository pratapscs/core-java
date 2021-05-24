package com.corejava.Conversion;

/* String to float in java using Float.parseFloat() method.
 * 
 * Scenario:
 * It is generally used if we have to perform mathematical operations on the 
 * string that contains float number. Whenever we get data from textfield or 
 * textarea, entered data is received as a string. If entered data is float, 
 * we need to convert string to float. To do so, we use Float.parseFloat() method.
 * 
 */
public class StringToFloatExample
{
	@SuppressWarnings("unused")
	public static void main(String args[])
	{  
		String s="23.6";  
		float f=Float.parseFloat("23.6");  
		System.out.println(f);  
		
		}

}
