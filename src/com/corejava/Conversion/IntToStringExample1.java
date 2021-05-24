package com.corejava.Conversion;

/* Java int to String:
 * convert int to String in java using String.valueOf() and 
 * Integer.toString() methods.
 * 
 * Scenario:
 * It is generally used if we have to display number in textfield because 
 * everything is displayed as a string in form.
 * 
 * 
 */
public class IntToStringExample1 
{
	public static void main(String args[])
	{  
		int i=200;  
		String s=String.valueOf(i);  
		System.out.println(i+100);//300 because + is binary plus operator  
		System.out.println(s+100);//200100 because + is string concatenation operator  
		}

}
