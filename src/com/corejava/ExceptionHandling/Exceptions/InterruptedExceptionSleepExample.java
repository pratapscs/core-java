package com.corejava.ExceptionHandling.Exceptions;

/* -java.lang.Object
 *  -java.lang.Throwable
 *   -java.lang.Exception
 *    -java.lang.InterruptedException
 *    
 * java.lang.InterruptedException is a compile time Exception in java.
 * 
 * InterruptedException is thrown when a thread is sleeping, waiting or 
 * occupied, and the thread is interrupted, either before or during the activity.
 * 
 */

//sleep() method throws compile time exception i.e. InterruptedException.

public class InterruptedExceptionSleepExample {

	  public static void main(String args[]) {
	      System.out.println("a");
	      try {
	           Thread.sleep(1000);//current thread (i.e. main thread) will sleep for 1 second
	      } catch (InterruptedException e) {
	           e.printStackTrace();
	      }
	      System.out.println("b");
	      
	  }
}
