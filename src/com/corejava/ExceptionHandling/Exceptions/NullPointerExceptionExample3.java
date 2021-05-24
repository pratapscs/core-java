package com.corejava.ExceptionHandling.Exceptions;

//Finding out length of null array throws NullPointerException .
public class NullPointerExceptionExample3 {

	@SuppressWarnings("null")
	public static void main(String args[]) {
	      int arr[] = null;
	      System.out.println(arr.length); //It will throw NullPointerException
	  }
}
