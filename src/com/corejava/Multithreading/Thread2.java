package com.corejava.Multithreading;

//Threads as light weight process :
//create Thread-1 and Thread-2 on same process i.e. on MyRunnable3. 
/*
 * Runnable interface - Represents a task to be run on a thread 
 * 					  - Only member is the run method
 * 
 * Thread class - Represents a thread of execution 
 * 				- Can interact with and effect thread state 
 * 				- Begin execution with start method
 */

class MyRunnable3 implements Runnable
{
    public void run(){
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
 
public class Thread2 {
    public static void main(String...args){
           MyRunnable3 myRunnable=new MyRunnable3();
           Thread thread1=new Thread(myRunnable,"Thread-1");
           Thread thread2=new Thread(myRunnable,"Thread-2");
           thread1.start();
           thread2.start();
    }
}
 