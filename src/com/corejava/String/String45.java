package com.corejava.String;
/*45.give the memory map for String s1="Rama"; s1.concat("sita");
 * 
 */
public class String45 
{
	public static void main(String[] args) 
	{
		String s1="Rama";
		//String s2 =	s1;
		
		String s2 =	s1.concat("sita");
		String s3="Rama";
		
		System.out.println(s2==s3);
		
	}

}
