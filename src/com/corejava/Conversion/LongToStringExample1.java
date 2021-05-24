package com.corejava.Conversion;

/* long to String in java using String.valueOf() and Long.toString() methods.
 * 
 * Scenario:
 * It is generally used if we have to display long number in textfield 
 * because everything is displayed as a string in form.
 * 
 */
public class LongToStringExample1
{
	public static void main(String args[])
	{  
		long i=8867527402L;  
		String s=String.valueOf(i);  
		System.out.println(s);  
		}

}
