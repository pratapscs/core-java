package com.corejava.Multithreading;

class MyThread1 extends Thread
{
    public void run()
    {
           System.out.println("in run() method");
    }
}

public class Thread5 
{
	// Step1.when enter main() mehod : as soon as main is called by JVM is pushed on stack.
    public static void main(String...args)
    {
           System.out.println("In main() method"); 
    // Step2.when main() method calls method1() : as soon as main calls main method1(),method1() pushed on stack.       
           method1(); 
    }
    /* Step3.when method1() calls thread.start(); 
     * method1 creates new thread by calling thread.start(),
     * as threads have their own stack - new stack is created.
     */
   static void method1()  
    {
           MyThread1 obj=new MyThread1();   
           obj.start();
    }
}
 