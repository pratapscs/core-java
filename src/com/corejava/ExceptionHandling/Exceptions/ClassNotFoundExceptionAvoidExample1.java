package com.corejava.ExceptionHandling.Exceptions;

public class ClassNotFoundExceptionAvoidExample1 
{
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String... a) 
	{
		 
	      System.out.println("initialize 'ReflectionClass' at runtime");
	      // initialize 'ReflectionClass' at runtime
	      Class cls = null;
	      try
	      {    
	    	   /* Solution :  Make class available in package 
	    	    * com.corejava.ExceptionHandling and call 
	    	    * forName(String className) method of java.lang.Class class.
	    	    */
	    	  
	           cls = Class.forName("com.corejava.ExceptionHandling.ReflectionClass");
	      } 
	      catch (ClassNotFoundException e) 
	      {
	           e.printStackTrace();
	      }
	 
	  }

}
