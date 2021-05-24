package com.corejava.String;
/*75.can we explicitly put a string object which is the non-constant pool into the
 *  constant pool?
 * 
 * yes
 */
public class String75 
{
	public static void main(String[] args)
	{
		String literal = "test";
		String one = new String(literal);
		String two = "test";

		System.out.println(literal == two); //true
		System.out.println(one == two); //false
	}

}
