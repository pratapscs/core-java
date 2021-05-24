package com.corejava.Multithreading;

public class DestroyTest 
{
    public static void main(String[] args) throws InterruptedException 
    {
           final Thread thread1=new Thread("Thread-1")
           {
                  @SuppressWarnings("deprecation")
				public void run() 
                  {
                        System.out.println(Thread.currentThread().getName()+" has started.");
                        Thread.currentThread().destroy();
                        System.out.println(Thread.currentThread().getName()+" has ENDED."); 
                  }
 
           };
           thread1.start();
 
    }   
}