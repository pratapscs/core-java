package com.corejava.Multithreading;

/* To achieve we are going to create 2 threads on same Runnable Object, 
 * create for loop in run() method and start  both threads. There is no surety
 * that which threads will complete first,  both threads will enter anonymously 
 * in for loop.
 */
class MyRunnable5 implements Runnable
{
	
    public void run()
    {
           System.out.println("in run() method");
           for(int i=0;i<5;i++)
           {
                  System.out.println("i="+i+" ,ThreadName="+Thread.currentThread().getName());
           }          
    }
}

public class Thread6 
{
    public static void main(String...args)
    {
           System.out.println("In main() method");
           MyRunnable5 runnable=new MyRunnable5();
           Thread thread1=new Thread(runnable);
           Thread thread2=new Thread(runnable);
           thread1.start();
           thread2.start();
           System.out.println("end main() method");
    }
}

/*
 * We cannot stay assure which Thread will complete first, in one the case 
 * main thread ended before Thread1 and Thread2. while in other Thread-1 
 * started in mid of main thread.
 * 
 * So, this shows Threads have unpredictable behaviour in Java.
 */
