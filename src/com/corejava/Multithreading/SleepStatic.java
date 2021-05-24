package com.corejava.Multithreading;

class MyRunnablea implements Runnable {
    public void run() {
 
           System.out.println(Thread.currentThread().getName() + " has started");
           try {
                  Thread.sleep(100); //ensure that main thread don’t complete before Thread-1
           } catch (InterruptedException e) {
                  e.printStackTrace();
           }
           System.out.println(Thread.currentThread().getName() + " has ended");
 
    }
}

public class SleepStatic {
    @SuppressWarnings("static-access")
	public static void main(String... args) throws InterruptedException {
 
           System.out.println(Thread.currentThread().getName() + " has started");
 
           Thread thread1 = new Thread(new MyRunnablea(), "Thread-1");
           thread1.start();
           thread1.sleep(10000); //we will face warning - The static method 
                     //sleep(long) from the type Thread should be accessed in a static way
 
           System.out.println(Thread.currentThread().getName() + " has ended");
 
    }
}