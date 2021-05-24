package com.corejava.ExceptionHandling.Exceptions;

/* If any RuntimeException occurs in : static initialization block of class or 
 * during initialing of the static variables then NoClassDefFoundError may be
 * thrown.
 * 
 * We will create another simple program to understand how RuntimeException occured  
 * in static block of class can throw NoClassDefFoundError.
 * 
 */
public class NoClassDefFoundErrorExample2 
{
	public static void main(String[] args) 
	{
	     try 
	     {
	         new A1(); // It will throw java.lang.ExceptionInInitializerError
	     } 
	     catch (Error error) 
	     {
	         error.printStackTrace();
	     }
	     
	     System.out.println("\n--------------\n");
	     
	     try {
	         new A1(); // It will throw java.lang.NoClassDefFoundError
	     } catch (Error error) {
	         error.printStackTrace();
	     }
	 
	 }
	 
	}
	 
	class A1
	{
	 
	 static {
	      System.out.println("In static block of class A");
	      System.out.println(1 / 0); // It will throw java.lang.ArithmeticException
	 }
	 
	 /*
	  * Constructor of class A will never get executed
	  */
	 A1() 
	 {
	      System.out.println("In constructor of class A");
	 }
	}