package com.corejava.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class StringContainsAlphabetsExample
{
  public static void main(String[] args) 
  {
      Pattern pattern = Pattern.compile(".*[a-zA-Z]+.*");
 
      String str = "a123";
      
      Matcher matcher = pattern.matcher(str);
 
      if (matcher.matches())
      {
           System.out.println("string '"+str + "' contains at least one alphabets/letters");
      } else {
           System.out.println("string '"+str + "' doesn't contains any alphabets/letters value");
      }
 
  }
}
