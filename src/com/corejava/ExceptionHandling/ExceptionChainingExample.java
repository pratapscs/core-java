package com.corejava.ExceptionHandling;

public class ExceptionChainingExample 
{
	public static void main(String[] args) 
	{
        new ExceptionChainingExample().method1();
    }

 void method1() {
        method2();
 }
 
 void method2() {
        method3();
 }
 
 void method3() {
        try{
               throw new NullPointerException();
        }catch(RuntimeException e){
               throw new RuntimeException("RuntimeException occured", e);
        }
 }
 
 /* When NullPointerException is thrown we catch it and a new RuntimeException exception 
  * is created with the original cause(i.e. NullPointerException ) attached and the chain 
  * of exceptions is thrown up to the next higher level exception handler in java. 
  * 
  * stack trace of above exception chaining/ exception wrapping program>
  * RuntimeException was thrown in program.
  * Now, topmost ‘at’ tells the method which generated/throwed the exception.
  * method3() throwed exception.
  * method3() was called from method2()
  * method2() was called from method1()
  * method1() was called from main method.
  */

}
