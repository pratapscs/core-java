package com.corejava.ExceptionHandling.Exceptions;

//Any attempt to access or modify the field of a null object throws NullPointerException.
class Employee1{
	  int id;
	  public int getId() {
	      return id;
	  }
	}
	 
	public class NullPointerExceptionExample2 {
	
	@SuppressWarnings("null")
	public static void main(String args[]) {
	      Employee1 emp =null;
	      emp.id= 1;     //It will throw NullPointerException
	  }
	}
	 
