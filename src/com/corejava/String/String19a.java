package com.corejava.String;

/*19.how do u compare two strings in java?
 * 
 * We can compare string in java on the basis of content and reference.
 * 
 * It is used in authentication (by equals() method), 
 *               sorting        (by compareTo() method), 
 *               reference matching (by == operator) etc.
 * 
 */
public class String19a
{
	public static void main(String[] args) 
	{
		//1) String compare by equals() method
		
			   String s1="Sachin";  
			   String s2="Sachin";  
			   String s3=new String("Sachin");  
			   String s4="Saurav";  
			   System.out.println(s1.equals(s2));//true  
			   System.out.println(s1.equals(s3));//true  
			   System.out.println(s1.equals(s4));//false  
			 }  
		
		
	}

