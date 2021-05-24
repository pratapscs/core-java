package com.corejava.String;
/*38.is the String class mutable or immutable?
 * 
 * Strings are always immutable.
 * 
 */
public class String38
{
	public static void main(String[] args) 
	{
		String str = "Good";  //"Good" it goes into the String Pool.
		str = str + " Morning";//" Morning" it goes into the String Pool as well.
		System.out.println(str);
		//Good Morning" created by concatenating "Good" and " Morning". 
			
	}
	

}
