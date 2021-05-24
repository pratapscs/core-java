package com.corejava.ExceptionHandling.Exceptions;

/* NoClassDefFoundError is thrown when JVM tries to load class but no
 * definition of class could be found.
 */
import org.apache.commons.lang.StringUtils;

public class NoClassDefFoundErrorExample3
{
 public static void main(String... arg)
 {
     System.out.println(StringUtils.class + " loaded");
     System.out.println(StringUtils.isNotEmpty("java")); //true
 
 }
}

/*  NoClassDefFoundError :
 * 1.NoClassDefFoundError is a Error in java. 
 * Error and its subclasses are regarded as unchecked exceptions in java.
 * 
 * 2.Here is the hierarchy of java.lang.NoClassDefFoundError -
-java.lang.Object
 -java.lang.Throwable
  -java.lang.Error
   -java.lang.LinkageError
    -java.lang.NoClassDefFoundError
 *
 * 3.NoClassDefFoundError is thrown when JVM tries to load class which >
 * was NOT available at runtime but
 * was available at compile time.
 * 
 * 4.These methods will never throw NoClassDefFoundError.
 * 
 * 5.You must ensure that class does not throws 
 * java.lang.ExceptionInInitializerError because that is likely to be followed
 * by NoClassDefFoundError.
 * 
 * 6.NoClassDefFoundError is thrown when JVM tries to load class but no definition
 * of class could be found. 
 * Or, you can simply say class was unavailable in classpath at runtime.
 * 
 */
 