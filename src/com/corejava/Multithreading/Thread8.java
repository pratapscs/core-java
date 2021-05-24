package com.corejava.Multithreading;

//run() method to start a thread
class MyRunnable7 implements Runnable
{
    public void run()
    {   //overrides Runnable's run() method
           System.out.println("in run() method");
           System.out.println("currentThreadName= "+ Thread.currentThread().getName());
    }
}
 
public class Thread8
{
    public static void main(String args[])
    {
           System.out.println("currentThreadName= "+ Thread.currentThread().getName());
           MyRunnable7 runnable=new MyRunnable7(); 
           Thread thread=new Thread(runnable);
           thread.run();//when we called run() from main thread, run() method was 
                  //called by main Thread, not by newly created thread (i.e. Thread-0).
          
           // thread.start(); // it will print Thread-0
    }
}