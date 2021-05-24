package com.corejava.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class StringContainsNumericExample1 
{
  public static void main(String[] args) 
  {
 
      Pattern pattern = Pattern.compile(".*\\d.*");
 
      String str = "java7";
      
      Matcher matcher = pattern.matcher(str);
 
      if (matcher.matches()) {
           System.out.println("string '"+str + "' contains numeric value");
      } else {
           System.out.println("string '"+str + "' doesn't contains numeric value");
      }
 
  }
}