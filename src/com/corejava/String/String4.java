package com.corejava.String;
/*4.Does a java String end with a null character?
 * 
 * Java strings are not terminated with a null characters as in C or C++. 
 * Although java strings uses internally the char array but there is no 
 * terminating null in that. String class provides a method called length 
 * to know the number of characters in the string.
 * 
 */
public class String4 
{
	public static void main(String[] args)
	{
	    String s = "pratap";
	    System.out.println(s.length());
	}

}
