package com.corejava.ExceptionHandling.Exceptions;

//Throwing null as if it were a Throwable value throws NullPointerException .
public class NullPointerExceptionExample5 {
	
	public static void main(String args[]) {
	       m();
	  }
	  static void m(){
	       throw null; //It will throw NullPointerException
	  }
}
