package com.corejava.String;
/*71.what is the role of intern()?
 * 
 * java string intern() method returns the interned string.
 * 
 * It can be used to return string from pool memory,
 * if it is created by new keyword.
 * 
 * When the intern method is invoked, if the string pool already contains a string 
 * equal to this String object as determined by the equals(Object) method, then the 
 * string from the pool is returned. Otherwise, this String object is added to the 
 * string pool and a reference to this String object is returned.
 * 
 */
public class String71
{
	public static void main(String args[])
	{  
		String s1=new String("hello");  
		String s2="hello";  
		String s3=s1.intern();//returns string from pool, now it will be same as s2  
		System.out.println(s1==s2);//false because reference is different  
		System.out.println(s2==s3);//true because reference is same  
	}

}
