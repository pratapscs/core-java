package com.corejava.RegularExpressions;
//how to check string contains numeric value in java using regex?


import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class StringContainsNumericExample
{
  public static void main(String[] args)
  {
 
     // Pattern pattern = Pattern.compile(".*\\d.*");
	  Pattern pattern = Pattern.compile("[a-zA-Z ]*\\d+.*");
 
      String str = "java8";
      Matcher matcher = pattern.matcher(str);
 
      if (matcher.matches()) {
           System.out.println("string '"+str + "' contains numeric value");
      } else {
           System.out.println("string '"+str + "' doesn't contains numeric value");
      }
 
  }
}
 