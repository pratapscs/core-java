package com.corejava.RegularExpressions;

//How to check string contains ONLY alphabets/letters in Java?

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class StringContainsOnlyAlphabetsExample1 
{
  public static void main(String[] args)
  {
 
      Pattern pattern = Pattern.compile("[a-zA-Z]+");
 
      String str = "abcd";
      
      Matcher matcher = pattern.matcher(str);
 
      if (matcher.matches())
      {
           System.out.println("string '"+str + "' contains only alphabets/letters");
      } else {
           System.out.println("string '"+str + "' doesn't contains only alphabets/letters value");
      }
 
  }
}
 