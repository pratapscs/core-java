package com.corejava.ExceptionHandling;

public class ExceptionChainingExample1 
{
	public static void main(String[] args) {
        new ExceptionChainingExample().method1();
 }

 void method1() {
        method2();
 }
 
 void method2() {
        method3();
 }
 
 void method3() {
        try
        {
               throw new NullPointerException();
        }
        catch (Exception cause)
        {
         StackTraceElement elements[] = cause.getStackTrace();
         for (int i = 0, n = elements.length; i < n; i++) 
         {      
             System.err.println("fileName ="+elements[i].getFileName()+ ", method name = " + elements[i].getMethodName() + "()"+ ", line no =" + elements[i].getLineNumber() );
         }
        }
 }

}
