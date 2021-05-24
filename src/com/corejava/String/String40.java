package com.corejava.String;

/*40.what is a String literal?
 * 
 * any data present with in double quote is refer to as String literal.
 * 
 */
public class String40 
{
	public static void main(String[] args) 
	{
		//both string literals refer the same object
		String a = "abc"; 
		String b = "abc";
		System.out.println(a == b);  // true
		
		//2 different objects are created and they have different references
		String c = new String("abc");
		String d = new String("abc");
		System.out.println(c == d);  // false
		
	}
	

}
