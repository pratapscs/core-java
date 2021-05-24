package com.corejava.Multithreading;

//acquire lock on class’s class object by entering synchronized block.
class MyRunnable10 implements Runnable
{	 
    @Override
    public void run()
    {
      synchronized (Thread18.class) 
      {
        for(int i=0;i<5;i++)
        {
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
                  
}

public class Thread18 
{
    public static void main(String args[]) throws InterruptedException
    {
 
           MyRunnable10 object1=new MyRunnable10();
           MyRunnable10 object2=new MyRunnable10();
           
           Thread thread1=new Thread(object1,"Thread-1");
           Thread thread2=new Thread(object2,"Thread-2");
           thread1.start();        
           thread2.start();        
           
           
    }
 
}