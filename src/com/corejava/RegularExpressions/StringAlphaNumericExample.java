package com.corejava.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*How to check string is alphanumeric or not in Java?
 */
public class StringAlphaNumericExample
{
	public static void main(String[] args) 
	{
		 
	      Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
	 
	      String str = "abc12";
	      
	      Matcher matcher = pattern.matcher(str);
	 
	      if (matcher.matches()) 
	      {
	           System.out.println("string '"+str + "' is alphanumeric");
	      } else {
	           System.out.println("string '"+str + "' isn't alphanumeric");
	      }
	 
	  }

}
