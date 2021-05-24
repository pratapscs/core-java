package com.corejava.ExceptionHandling;

public class ExceptionTest5 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) {
        
        try{
               int i=10/0; //will throw ArithmeticException
        }catch(ArithmeticException e){
               System.out.println("ArithmeticException handled in catch block");
        }
        finally{
               System.out.println("finally block executed");              
        }

     System.out.println("code after try-catch-finally block");
 }

}
