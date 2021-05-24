package com.corejava.String;
/*48.what is the role of equals()?
 * 
 * java string equals() method compares the two given strings based on 
 * the content of the string. If any character is not matched, it returns false. 
 * If all characters are matched, it returns true.
 * 
 */
public class String48
{
	public static void main(String args[])
	{  
		String s1="javatprogramming";  
		String s2="javatprogramming";  
		String s3="JAVATPROGRAMMING";  
		String s4="python"; 
		
		System.out.println(s1.equals(s2));//true because content and case is same  
		System.out.println(s1.equals(s3));//true because case is ignored  
		System.out.println(s1.equals(s4));//false because content is not same  
		}
}
