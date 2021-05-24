package com.corejava.Multithreading;

// acquire object lock by entering synchronized block.

class MyRunnable8 implements Runnable 
{
    public void run() 
    {      
           synchronized (this)  // this -> thread has acquired object lock on object referenced by Thread16 
           {
                  for(int i=0;i<5;i++)
                  {
                        System.out.println(i+" "+Thread.currentThread().getName()+" is executing");
                        try 
                        {
                               Thread.sleep(500);
                        } catch (InterruptedException e)
                        {
                        	e.printStackTrace(); 
                        }
                  }
                  
           }
    }
 
}
public class Thread16 
{
    public static void main(String args[]) throws Exception
    {
 
           MyRunnable8 obj = new MyRunnable8();
           Thread t1 = new Thread(obj,"Thread-1");  //Thread-1 on obj.
           Thread t2 = new Thread(obj,"Thread-2"); //Thread-2 on obj.
           t1.start();
           t2.start();
 
    }
}