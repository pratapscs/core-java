package com.corejava.ExceptionHandling;

public class ExceptionTest4
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
        
        try{
               int i=10/1;
        }catch(ArithmeticException e){
               System.out.println("ArithmeticException handled in catch block");
        }
        finally{
               System.out.println("finally block executed");              
        }

        System.out.println("code after try-catch-finally block");
 }

}
