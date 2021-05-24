package com.corejava.String;

/*14.what is the role of equals() in java?
 * 
 * java string equals() method compares the two given strings based on the content
 * of the string. If any character is not matched, it returns false.
 * If all characters are matched, it returns true.
 * 
 */
public class String14 
{
	public static void main(String args[])
	{  
		String s1="pratap";  
		String s2="pratap";  
		String s3="PRATAP";  
		String s4="python";  
		System.out.println(s1.equals(s2));//true because content and case is same  
		System.out.println(s1.equals(s3));//false because case is not same  
		System.out.println(s1.equals(s4));//false because content is not same  
		}

}
