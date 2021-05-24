package com.corejava.Multithreading;

class MyThread2 extends Thread 
{
    //don't override run() method
}
 
public class DontOverrideRun 
{
    public static void main(String[] args) {
           System.out.println("main has started.");
           MyThread2 thread1=new MyThread2();
           thread1.start();
           System.out.println("main has ended.");
    }
 
}
 