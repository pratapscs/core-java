package com.corejava.ExceptionHandling.Exceptions;

public class NullPointerExceptionAccessStringExample2 {

	@SuppressWarnings("null")
	public static void main(String args[]) {
	      String str =null;
	      str.charAt(0);      //It will throw NullPointerException
	  }
	}
	 
