package com.corejava.Java4features;

/* Assertion:
 * 
 * Assertion is a statement in java. 
 * 
 * It can be used to test your assumptions about the program.
 * 
 * While executing assertion, it is believed to be true. 
 * If it fails, JVM will throw an error named AssertionError. 
 * It is mainly used for testing purpose.
 * 
 * Advantage:
 * It provides an effective way to detect and correct programming errors.
 * 
 * Syntax:
 * a.assert expression;  
 * b.assert expression1 : expression2;
 * 
 * 
 * Where not to use Assertion:
 * There are some situations where assertion should be avoid to use. They are:
 * 
 * According to Sun Specification, assertion should not be used to check arguments 
 * in the public methods because it should result in appropriate runtime exception 
 * e.g. IllegalArgumentException, NullPointerException etc.
 * 
 * Do not use assertion, if you don't want any error in any situation.
 * 
 */
import java.util.Scanner;  

class AssertionExample
{  
 @SuppressWarnings("resource")
public static void main( String args[] )
 {  
  
  Scanner scanner = new Scanner( System.in );  
  System.out.print("Enter ur age ");  
    
  int value = scanner.nextInt();  
  assert value>=18:" Not valid"; 
  
  System.out.println("value is "+value);  
 }   
}  
