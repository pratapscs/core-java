package com.corejava.String;
/*65.what is the default buffersize of the StringBuffer class?
 * 
 *16 
 */
public class String65 
{
	public static void main(String args[])
	{  
		StringBuffer sb=new StringBuffer();  
		System.out.println(sb.capacity());//default 16  
	}
}
