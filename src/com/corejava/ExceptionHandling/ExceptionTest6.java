package com.corejava.ExceptionHandling;

public class ExceptionTest6 
{
	 @SuppressWarnings("unused")
	public static void main(String[] args) {
         
         try{
                int i=10/0; //will throw ArithmeticException
         }catch(IndexOutOfBoundsException e){
                System.out.println("IndexOutOfBoundsException handled in catch block");
         }
         finally{
                System.out.println("finally block executed");              
         }

         System.out.println("code after try-catch-finally block");
  }
	 /*
	  * finally block was executed but catch block didn’t because Exception wasn’t 
	  * handled properly in this program - program throwed ArithmeticException but
	  * we were handing IndexOutOfBoundsException.
	  * 
	  * Also, sysout statement after try-catch-finally block wasn’t executed.
	  */

}
