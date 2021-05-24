package com.corejava.String;
/*31.what happens when you add a float value to a String?
 *
 * String
 */
public class String31
{
	public static void main(String[] args)
	   {
	     
		float f = Float.parseFloat("25");
		String s = Float.toString(25.0f);
		System.out.println(f);
		System.out.println(s);
		
		String s1="abc";
		s1=s1+34.21;
		
		System.out.println(s1);
	   }

}
