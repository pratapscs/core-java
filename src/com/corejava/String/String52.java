package com.corejava.String;
/*52.Explain the two versions of substring()?
 * 
 * public String substring(int startIndex)  
 * 
 *public String substring(int startIndex, int endIndex) 
 * 
 */
public class String52 
{
	public static void main(String args[])
	{  
		String s1="javatpoint";  
		System.out.println(s1.substring(2,4));//returns va  
		System.out.println(s1.substring(2));//returns vatpoint  
		}

}
