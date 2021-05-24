package com.corejava.ExceptionHandling.Exceptions;

/* join() method ensure all threads that started from main must end in order in which 
 * they started and also main should end in last.In other words waits for thread to die 
 * on which thread has been called.
 * 
 * join() method throws InterruptedException 
 */
 
class MyRunnable1 implements Runnable
{
	  public void run() {
	      System.out.println("in run() method");
	      for (int i = 0; i < 2; i++) {
	           System.out.println("i=" + i + " ,ThreadName="
	                    + Thread.currentThread().getName());
	      }
	  }
	}
	 
	public class InterruptedExceptionJoinExample 
	{
	  public static void main(String... args)
	  {
	      System.out.println("In main() method");
	      MyRunnable1 runnable = new MyRunnable1();
	      Thread thread1 = new Thread(runnable);
	      Thread thread2 = new Thread(runnable);
	 
	      thread1.start();
	      
	      try {
	           thread1.join();
	      } catch (InterruptedException e) {
	           e.printStackTrace();
	      }
	 
	      thread2.start();
	      try {
	           thread2.join();
	      } catch (InterruptedException e) {
	           e.printStackTrace();
	      }
	 
	      System.out.println("end main() method");
	  }
	}

/* wait(long timeout, int nanos) - Causes the current thread to wait until either 
 * another thread invokes the notify() or notifyAll() methods for this object, or a 
 * specified timeout time plus the specified number of nanoseconds has elapsed.
 */
 

