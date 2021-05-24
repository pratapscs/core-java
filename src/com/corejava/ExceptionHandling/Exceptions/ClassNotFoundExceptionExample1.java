package com.corejava.ExceptionHandling.Exceptions;

/* Loading classes via Reflection in java : ClassNotFoundException is thrown 
 * whenever an application tries to load a class by passing class name as 
 * String in forName(String className) method of Class class.
 * 
 */
public class ClassNotFoundExceptionExample1
{
	@SuppressWarnings({ "unused", "rawtypes" })
	public static void main(String... a)
	{
		 
	      System.out.println("initialize 'ReflectionClass' at runtime");
	 
	      // initialize 'ReflectionClass' at runtime
	      Class cls = null;
	      try 
	      {
	           cls = Class.forName("corejava.ExceptionHandling.ReflectionClass");
	      }
	      catch (ClassNotFoundException e) 
	      {
	           e.printStackTrace();
	      }
	 
	  }

}
