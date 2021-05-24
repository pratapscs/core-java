package com.corejava.ExceptionHandling.Exceptions;

class MyRunnable implements Runnable
{
	  public void run()
	  {
	      synchronized (this) {
	           System.out.println("MyRunnable,in run() method");
	           try {
	               this.wait(1000); //thread will wait for 1 second
	               System.out.println("Thread in runnable state after 1 second");
	           } catch (InterruptedException e) {
	               e.printStackTrace();
	           }
	      }
	  }
	}
	 
	public class InterruptedExceptionWaitExample  {
	  public static void main(String[] args) {
	      MyRunnable myRunnable=new MyRunnable();
	      Thread thread1=new Thread(myRunnable,"Thread-1");
	      thread1.start();
	  }
	}
