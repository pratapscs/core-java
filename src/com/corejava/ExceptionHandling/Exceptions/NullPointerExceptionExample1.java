package com.corejava.ExceptionHandling.Exceptions;
/*
 *-java.lang.Object
 * -java.lang.Throwable
 *  -java.lang.Exception
 *   -java.lang.RuntimeException
 *    -java.lang.NullPointerException
 *    
 *  java.lang.NullPointerException is a RuntimeExceptions in java.
 *  
 *  NullPointerException is thrown when an java application tries to use null in place of 
 *  object.It happens generally when something has not been initialized properly.
 */

//NullPointerException is thrown when an instance method of a null object is accessed.
class Employee{
	  
	  int id;
	  
	  public int getId() {
	      return id;
	  }
	}
	 
public class NullPointerExceptionExample1 {
	@SuppressWarnings("null")
	public static void main(String args[]) {
	      Employee emp =null;
	     
	      emp.getId();   //It will throw NullPointerException
	      
	      
	  }
	}
	 