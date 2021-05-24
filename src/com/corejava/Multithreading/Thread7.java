package com.corejava.Multithreading;

class MyRunnable6 implements Runnable
{
    public void run()
    {
        System.out.println("in run() method");
           for(int i=0;i<5;i++){
                  System.out.println("i="+i+" ,ThreadName="+Thread.currentThread().getName());
           }          
    }
}
 
public class Thread7 
{
    public static void main(String...args) throws InterruptedException //join() method throws InterruptedException
    {
           System.out.println("In main() method");
           MyRunnable6 runnable=new MyRunnable6();
           Thread thread1=new Thread(runnable);
           Thread thread2=new Thread(runnable);

           thread1.start();
           thread1.join(1000); //once 1000 millisec are up, main thread can resume and start thread2.
           
                            /*join() method to ensure all threads that started from 
                            main must end in order in which they started and also 
                            main should end in last.In other words waits for thread 
                            to die on which thread has been called.*/
                           
                           /* join() method belongs to java.lang.Thread class.*/

           thread2.start();
           thread2.join(); /*join() is a instance method, hence we need to have 
                            thread  instance for calling this method.*/
                           
                           /*Thread state : when join() method is called on thread 
                             it goes from running to waiting state. And wait for 
                             thread to die.
                            */

           System.out.println("end main() method");
    }
}