package com.corejava.String;

/*34.can we directly print primitive datatypes?
 * 
 * yes
 * 
 */
public class String34 
{
	public static void main(String[] args) 
	{
		int i = 20;
		float f = 20.2f;
		System.out.println(((Object)i).getClass().getName());
		System.out.println(((Object)f).getClass().getName());
	}

}
