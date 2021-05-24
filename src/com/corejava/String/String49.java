package com.corejava.String;
/*49.what is the role of equalsIgnoreCase()?
 * 
 * String equalsIgnoreCase() method compares the two given strings on the 
 * basis of content of the string irrespective of case of the string. 
 * It is like equals() method but doesn't check case. If any character
 * is not matched, it returns false otherwise it returns true.
 * 
 */
public class String49 
{
	public static void main(String args[])
	{  
		String s1="javatprogramming";  
		String s2="javatprogramming";  
		String s3="JAVATPROGRAMMING";  
		String s4="python";  
		
		System.out.println(s1.equalsIgnoreCase(s2));//true because content and case is same  
		System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored  
		System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same  
		}

}
