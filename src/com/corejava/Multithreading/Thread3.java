
package com.corejava.Multithreading;

/* Program to create thread implementing java.lang.Runnable:
 */
class MyRunnable4 implements Runnable
{
    public void run(){   //overrides Runnable's run() method
           System.out.println("in run() method");
    }
}

public class Thread3 {
    public static void main(String args[])
    {
           MyRunnable4 runnable=new MyRunnable4(); 
          
           /* Create Runnable object, pass it in thread constructor. 
            * But our thread is not going to start until we call thread.start(),
            * calling start() method internally calls run() method.
            */
           
           Thread thread=new Thread(runnable);
           thread.start();
    }
}