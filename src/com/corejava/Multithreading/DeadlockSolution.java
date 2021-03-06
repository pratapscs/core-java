package com.corejava.Multithreading;

class A1 implements Runnable
{
    public void run()
    {      
           synchronized (String.class) 
           {
                  //using Thread.sleep(100); // is optional.
                  System.out.println(Thread.currentThread().getName() + " has acquired lock "
                            + "on String class and waiting to acquire lock on Object class...");
                  synchronized (Object.class) 
                  {
                        System.out.println(Thread.currentThread().getName()+" has acquired "
                                      + "lock on Object class");
                  }
           }
           
           System.out.println(Thread.currentThread().getName()+" has ENDED");
    }
}
 
class B1 extends Thread{
    public void run() 
    {
           
           synchronized (String.class)
           {  
                  System.out.println(Thread.currentThread().getName()+" has acquired lock on "
                              + "Object class and waiting to acquire lock on String class...");
                  
                  synchronized (Object.class) {
                        System.out.println(Thread.currentThread().getName()+" has acquired "
                                      + "lock on String class");
                  }
           }
           
           System.out.println(Thread.currentThread().getName()+" has ENDED");
    }
}
 

public class DeadlockSolution 
{
 
    public static void main(String[] args) 
    {
           Thread thread1=new Thread(new A1(),"Thread-1");
           Thread thread2=new Thread(new B1(),"Thread-2");
           thread1.start();
           thread2.start();
    }
 
}
 