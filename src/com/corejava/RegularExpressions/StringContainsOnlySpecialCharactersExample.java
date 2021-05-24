package com.corejava.RegularExpressions;

/*How to check string contains ONLY special characters in Java?
 * 
 * Regular expressions provides one of the simplest ways to find whether
 * string contains only special characters or not in java. 
 * 
 */
public class StringContainsOnlySpecialCharactersExample 
{
	public static void main(String[] args) 
	{
		 
	      String str = "@#!";
	      String specialCharacters = "[" + "-/@#!*$%^&.'_+={}()"+ "]+" ;
	      
	      if ( str.matches(specialCharacters))
	      {
	           System.out.println("string '"+str + "' contains only special character");
	      } else {
	           System.out.println("string '"+str + "' doesn't contains only special character");
	      }
	  }

}
