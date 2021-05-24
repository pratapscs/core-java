package com.corejava.ExceptionHandling;

/*
 * User defined Exception/ custom Exception
 */
@SuppressWarnings("serial")
class UserDefinedException extends Exception 
{ 
    UserDefinedException(String s) {
           super(s);
    }
 
}
 
public class UserDefinedExceptionTest
{
    public static void main(String... arg)
    {
           try {
                  throw new UserDefinedException("user defined exception was thrown "
                                                      + "and handled.");
           } catch (UserDefinedException e) {
                  e.printStackTrace();
           }
 
    }
}