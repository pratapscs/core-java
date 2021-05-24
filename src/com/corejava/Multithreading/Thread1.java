package com.corejava.Multithreading;

/* When threads are not lightweight process in java, in fact they become 
 * heavy weight process?
 * 
 * Threads are lightweight process only if threads of same process are executing 
 * concurrently. But if threads of different processes are executing concurrently 
 * then threads are heavy weight process.
 * 
 * Threads as heavy weight process : 
 * create Thread-1 and Thread-2 on different processes i.e. on MyRunnable1 
 * and MyRunnable2.
 */

class MyRunnable1 implements Runnable
{
    public void run()
    {
           for(int i=0;i<5;i++){
                  try {
                        Thread.sleep(100);
                  } catch (InterruptedException e) {
                        e.printStackTrace();
                  }
                  System.out.println("i="+i+" ,ThreadName="+Thread.currentThread().getName());
           }          
    }
}
 
class MyRunnable2 implements Runnable
{
    public void run()
    {
           for(int i=0;i<5;i++){
                  try {
                        Thread.sleep(100);
                  } catch (InterruptedException e) {
                        e.printStackTrace();
                  }
                  System.out.println("i="+i+" ,ThreadName="+Thread.currentThread().getName());
           }          
    }
}
 
public class Thread1 
{
    public static void main(String...args)
    {
           Thread thread1=new Thread(new MyRunnable1(),"Thread-1");
           Thread thread2=new Thread(new MyRunnable2(),"Thread-2");
           thread1.start();
           thread2.start();
    }
}