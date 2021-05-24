package com.corejava.ExceptionHandling.Exceptions;

/* ClassNotFoundException can be thrown when java application tries to 
 * load/initialize oracle.jdbc.driver.OracleDriver class by passing class 
 * name as String in Class.forName("oracle.jdbc.driver.OracleDriver") 
 * method of Class class but OracleDriver class is not present in classpath.
 * 
 */
public class ClassNotFoundExceptionExample2
{
	public static void main(String... arg) 
	{
	      System.out.println("register Oracle driver class, i.e. initialize OracleDriver");
	      try 
	      {
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
