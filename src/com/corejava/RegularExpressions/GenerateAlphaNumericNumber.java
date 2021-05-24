package com.corejava.RegularExpressions;

import java.util.Random;

public class GenerateAlphaNumericNumber 
{
  public static void main(String[] args)
  {
 
      int lengthOfRandomString = 6;
      Random rand = new Random();
      String alphaNumericCharacters = "abcdefghijklmnopqrstuvwxyz"
               + "ABCDEFGHIJLMNOPQRSTUVWXYZ"
               + "1234567890";
 
      // Use StringBuilder in place of String to avoid unnecessary object formation
      StringBuilder result = new StringBuilder();
      
      for (int i =0; i< lengthOfRandomString ; i++) 
      {
           result.append(alphaNumericCharacters.charAt(rand.nextInt(alphaNumericCharacters.length())));
      }
      System.out.println(result.toString());
  }
  
}