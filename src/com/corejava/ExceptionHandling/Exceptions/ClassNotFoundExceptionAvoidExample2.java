package com.corejava.ExceptionHandling.Exceptions;

public class ClassNotFoundExceptionAvoidExample2 
{
	public static void main(String... arg) 
	{
	      System.out.println("register Oracle driver class, i.e. initialize OracleDriver");
	      try {
	    	   // Solution : Make OracleDriver class available in classpath. 
	           // register Oracle driver class, i.e. initialize OracleDriver
	           Class.forName("oracle.jdbc.driver.OracleDriver");
	           System.out.println("Oracle driver class registered, i.e. initialized OracleDriver");
	      } 
	      catch (ClassNotFoundException e)
	      {
	           e.printStackTrace();
	      }
	  }

}
/* ClassNotFoundException :
 * 1.ClassNotFoundException is Checked (compile time) Exception in java.
 * 
 * 2.Here is the hierarchy of java.lang.ClassNotFoundException -
-java.lang.Object
 -java.lang.Throwable
  -java.lang.Exception
   -java.lang.ReflectiveOperationException
    -java.lang.ClassNotFoundException
 * 
 * 3.ClassNotFoundException is thrown when JVM tries to class from classpath
 * but it does not find that class.
 * 
 * 4.ClassNotFoundException is thrown whenever an java application tries to load a
 *  class by passing class name as String in following methods -
 * forName(String className) method of java.lang.Class class.
 * findSystemClass(String name) method of java.lang.ClassLoader class.
 * loadClass(String name) method of java.lang.ClassLoader class.
 * 
 * 5.ExceptionInInitializerError has got nothing to do with ClassNotFoundException.
 * 
 * 6.ClassNotFoundException is thrown when JVM tries to class from classpath but it unable to find that class. 
 * Or, you can simply say class was unavailable in classpath at runtime.
 *
 * 
 */
 