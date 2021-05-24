package com.corejava.Multithreading;

public class MyClass1 implements Runnable
{
    @Override
    public void run() {
           System.out.println("in run() method, method completed.");
    }
    
    public static void main(String[] args) 
    {
                  MyClass1 obj=new MyClass1(); 
                  
        Thread thread1=new Thread(obj,"Thread-1");
        thread1.start();
        thread1.start(); //will throw java.lang.IllegalThreadStateException at runtime
        
    }
 
}