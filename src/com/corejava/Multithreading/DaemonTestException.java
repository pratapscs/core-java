package com.corejava.Multithreading;

public class DaemonTestException 
{
    public static void main(String[] args) throws InterruptedException 
    {
    
           final Thread thread1=new Thread("Thread-1")
           {
                  public void run() 
                  {
                        System.out.println(Thread.currentThread().getName()+" has started");
                        System.out.println(Thread.currentThread().getName()+" has ended");
                  }
    
           };
           thread1.start();  //start daemon thread
           thread1.setDaemon(true);   //setting thread to daemon after start(), will throw IllegalThreadStateException.
           
    }   
}
 