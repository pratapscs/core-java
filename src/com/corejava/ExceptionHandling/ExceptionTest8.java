package com.corejava.ExceptionHandling;

public class ExceptionTest8 
{
	  public static void main(String[] args) {
          System.out.println("method return -> "+m());
   }
   
   @SuppressWarnings({ "unused", "finally" })
   
static String m()
   {
          try
          {
                 int i=10/0; //will throw ArithmeticException
          }
          catch(ArithmeticException e){
                 return "catch";
          }
          finally
          {
        	       return "finally";      
          }
   }

}
