package com.corejava.ExceptionHandling;

public class ExceptionTest16 
{
	public static void main(String[] args) 
	{
        System.out.println("method return -> "+m());
 }
 
 @SuppressWarnings({ "finally", "unused" })
static String m()
 {
        try{
               int i=10/0; //will throw ArithmeticException
               return "all";
        }catch(ArithmeticException e){
               return "catch";
        }finally{
              return "finally";              
        }
	 
//	 try{
//         int i=1;
//         return "try";
//  } finally{
//         return "finally";              
//  }
  
 }

}
