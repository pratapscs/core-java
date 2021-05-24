package com.corejava.String;
/*32.what happens when you add a boolean value to a String?
 * 
 * String
 * 
 */
public class String32 
{
	
	public static void main(String[] args)
	{
		Boolean boolean1 = Boolean.valueOf("true");
		boolean boolean2 = Boolean.parseBoolean("true");	
		System.out.println(boolean1);
		System.out.println(boolean2);
		
		String s1="abc";
		//s1=s1+false;
		s1=s1+null;
		
		System.out.println(s1);
	}

}
