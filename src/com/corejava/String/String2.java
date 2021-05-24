package com.corejava.String;

/*2.Is String an object in java?
 * 
 * string is a sequence of characters. But in java, string is an object 
 * that represents a sequence of characters. The java.lang.String class is 
 * used to create string object.
 * 
 */
public class String2 
{
	public static void main(String args[])
	{  
		String s1="java";//creating string by java string literal  
		char ch[]={'s','t','r','i','n','g','s'};  
		String s2=new String(ch);//converting char array to string  
		String s3=new String("example");//creating java string by new keyword  
		String s4="java";
		System.out.println(s1);  
		System.out.println(s2);  
		System.out.println(s3);  
		System.out.println(s4);
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		}

}
