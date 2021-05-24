package com.corejava.Multithreading;

/* Program to create thread extending java.lang.Thread:
 * 
 * Thread creation by extending java.lang.Thread class.
 * We will create object of class which extends Thread class :
 * MyThread obj=new MyThread();
 * 
 * But our thread is not going to start until we call obj.start()
 * calling start() method calls run() method.
 * 
 */

//start() method to start a thread
class MyThread extends Thread
{
    public void run(){   //overrides Thread's run() method
           System.out.println("in run() method");
           System.out.println("currentThreadName= "+ Thread.currentThread().getName());//thread-0
    }
}
 
public class Thread4 
{
    public static void main(String args[])
    {
        System.out.println("currentThreadName= "+ Thread.currentThread().getName());//main
        MyThread obj=new MyThread();   
           obj.start();
          //obj.run(); //when u call thread like this (main) thread will be print.
    }
}