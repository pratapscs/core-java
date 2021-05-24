package com.corejava.Conversion;

/* Java String to int:
 * convert String to int in java using Integer.parseInt() method.
 * 
 * 
 * Scenario:
 * It is generally used if we have to perform mathematical operations on 
 * the string that contains number. Whenever we get data from textfield 
 * or textarea, entered data is received as a string. If entered data is 
 * integer, we need to convert string to int. To do so, we use 
 * Integer.parseInt() method.
 * 
 */
public class StringToIntExample
{
	public static void main(String args[])
	{  
		String s="200";  
		int i=Integer.parseInt(s); //parseInt() is the static method of Integer class.
		System.out.println(s+100); //200100 because + is string concatenation operator  
		System.out.println(i+100); //300 because + is binary plus operator  
		}

}
