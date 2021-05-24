package com.corejava.ExceptionHandling;

public class ExceptionTest3 
{
	 @SuppressWarnings("unused")
	public static void main(String[] args) 
	 {  
         try
         {
                int i=10/0; //will throw ArithmeticException
         }catch(Exception e)
         {
                System.out.println("Exception handled  properly in catch block");
         }          
         System.out.println("Code after exception handling");
  }
}
