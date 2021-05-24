package com.corejava.Multithreading;

//acquire object lock by entering synchronized method.

class MyRunnable9 implements Runnable 
{    
    public void run() 
    {
           method1();        
    }
public synchronized void method1() //thread has acquired object lock on object referenced by Thread17
    {
           for(int i=0;i<5;i++){
                  System.out.println(i+" "+Thread.currentThread().getName()+" is executing");
                  try {
                        Thread.sleep(500);
                  } catch (InterruptedException e)
                  {
                	  e.printStackTrace();
                  }
           }
    }
 
}
public class Thread17 
{
    public static void main(String args[]) throws Exception 
    {
           MyRunnable9 obj = new MyRunnable9();
           Thread t1 = new Thread(obj,"Thread-1");  //Thread-1 on obj.
           Thread t2 = new Thread(obj,"Thread-2"); //Thread-2 on obj.
           t1.start();
           t2.start();
 
 
    }
}