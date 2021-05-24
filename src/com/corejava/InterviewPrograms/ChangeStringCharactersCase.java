package com.corejava.InterviewPrograms;

/*  program that will help us in changing case of characters in String in java.
 * 
 * input  String  : Pratap
 * output String  : pRATAP
 * 
 * ASCII value of A-Z = 65-90 where A=65, Z=90
 * ASCII value of a-z = 97-122 where a=97, z=122
 * 
 */
public class ChangeStringCharactersCase
{
	 public static void main(String args[]) 
	 {
         String inputString = "Pratap";
         System.out.println("input String : "+inputString);
         System.out.println("output    : "+changecase(inputString));
         
  }
  
  /**
   * method returns changed cases of characters in String.
   */
  static String changecase(String inputString) 
  {
         char ar[]=inputString.toCharArray();
         
         for (int i = 0; i < ar.length; i++)
         {
                
                if (ar[i]>=65 && ar[i] <=90) { //convert upperCase to lowerCase
                      ar[i] += 32;
                } else if(ar[i]>=97 && ar[i] <=122){  //convert lowerCase to upperCase.
                      ar[i] -= 32;
                }
                
         }
         return new String(ar);
  }


}
