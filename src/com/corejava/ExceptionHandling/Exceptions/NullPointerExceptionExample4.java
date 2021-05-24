package com.corejava.ExceptionHandling.Exceptions;

//Accessing or modifying the slots of null array throws NullPointerException.
public class NullPointerExceptionExample4 {

	@SuppressWarnings("null")
	public static void main(String args[]) {
	      int arr[] = null;
	      arr[0]=1; //It will throw NullPointerException
	  }
}
