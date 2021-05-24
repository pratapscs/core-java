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
public class String19c
{
	public static void main(String[] args) 
	{
		/*3) String compare by compareTo() method
		 * Suppose s1 and s2 are two string variables. If:
		 * s1 == s2 :0 
		 * s1 > s2   :positive value
		 * s1 < s2   :negative value
		 */
		
		String s1="Sachin";  
		   String s2="Sachin";  
		   String s3="Ratan";  
		   System.out.println(s1.compareTo(s2));//0  
		   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
		   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
		
			 }  
		
		
	}

