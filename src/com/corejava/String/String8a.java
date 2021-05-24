package com.corejava.String;

/*8.why are immutable strings required?
 * to store data which would never change(DOB,PAN number etc)
 */
public class String8a 
{
	public static void main(String[] args) {
		
		//1. Requirement of String Pool
		String string1 = "abcd";
		String string2 = "abcd";
		
		System.out.println(string1);
		System.out.println(string2);
		
		
	}

}
