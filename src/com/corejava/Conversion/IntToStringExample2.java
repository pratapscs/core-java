package com.corejava.Conversion;

/* Integer.toString() method converts int to String. 
 * 
 * The toString() is the static method of Integer class. 
 * 
 */
public class IntToStringExample2 
{
	public static void main(String args[])
	{  
		int i=200;  
		String s=Integer.toString(i);  
		System.out.println(i+100);//300 because + is binary plus operator  
		System.out.println(s+100);//200100 because + is string concatenation operator  
		}

}
