package com.corejava.String;
/*56.how does valueOf() behave on objects?
 * string valueOf() method, you can convert int to string, 
 *                                  long to string, boolean to string, 
 *                                  character to string, float to string, 
 *                                  double to string, object to string 
 *                                  and char array to string.
 * 
 */
public class String56 
{
	public static void main(String args[])
	{  
		double value=30.0;  
		String s1=String.valueOf(value);  
		System.out.println(s1+10);//concatenating string with 10  
		}	

}
