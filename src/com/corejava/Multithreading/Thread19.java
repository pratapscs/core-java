package com.corejava.Multithreading;

class MyRunnable11 implements Runnable{
	 
    @Override
    public void run()
    {
           method1();
           
    }
 
    public static synchronized void method1() //thread has acquired lock on MyRunnable’s class object.
    {
       for(int i=0;i<5;i++){
           System.out.println(i+" "+Thread.currentThread().getName()+" is executing");
           try {
                  Thread.sleep(500);
           } catch (InterruptedException e) {e.printStackTrace(); }
       }
    }
                  
}
 public class Thread19 
 {
    public static void main(String args[]) throws InterruptedException{
 
           MyRunnable11 object1=new MyRunnable11();
           MyRunnable11 object2=new MyRunnable11();
           
           Thread thread1=new Thread(object1,"Thread-1");
           Thread thread2=new Thread(object2,"Thread-2");
           thread1.start();        
           thread2.start();        
           
           
    }
 
}