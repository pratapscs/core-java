package com.corejava.String;
/*59.what is the role of concat()?
 * 
 * java string concat() method combines specified string at the end of this string.
 * It returns combined string. It is like appending another string.
 * 
 */
public class String59 
{
	public static void main(String args[])
	{  
		String s1="java string";  
		s1.concat("is immutable");  
		System.out.println(s1);  
		s1=s1.concat(" is immutable so assign it explicitly");  
		System.out.println(s1);  
		}

}
