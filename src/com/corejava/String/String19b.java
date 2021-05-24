package com.corejava.String;

/*19.how do u compare two strings in java?
 * 
 * We can compare string in java on the basis of content and reference.
 * 
 * It is used in authentication (by equals() method), 
 *               sorting (by compareTo() method), 
 *               reference matching (by == operator) etc.
 * 
 */
public class String19b
{
	public static void main(String[] args) 
	{
		//2) String compare by == operator
		
		String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("Sachin");  
		   System.out.println(s1==s2);//true (because both refer to same instance)  
		   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
	  
			 }  
		
		
	}

