package com.corejava.String;
/*81.why is char array preferred to store password in java than a String?
 * 
 * password is an entity  which would be change on regular basic as
 * the result of this it stored in charater array.
 * 
 */
public class String81
{
	public static void main(String[] args)
	{
		
		    Object pw = "Password";//
		    System.out.println("String: " + pw);

		    pw = "Password".toCharArray(); //char[] is less vulnerable.
		    System.out.println("Array: " + pw);
	}

}
