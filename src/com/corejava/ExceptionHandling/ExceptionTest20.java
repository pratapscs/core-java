package com.corejava.ExceptionHandling;

import java.io.IOException;

public class ExceptionTest20 
{
	 void method(Exception e)
	 {
         System.out.println(e+" caught in Exception method");
     }
  void method(ArithmeticException ae)
  {
         System.out.println(ae+" caught in ArithmeticException method");
  }
  
  public static void main(String[] args) 
  {
         ExceptionTest20 obj=new ExceptionTest20();
         obj.method(new ArithmeticException());
         obj.method(new IOException());
        
  }

}
