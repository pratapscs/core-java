package com.corejava.Multithreading;

class MyThread3 extends Thread
{	 
    @Override
    public void run() {
           System.out.println("in run() method");
    }
    
    @Override
    public void start(){
           System.out.println("In start() method");
    }
    
}
 
public class OverrideStartMethod
{
    public static void main(String[] args) {
           System.out.println("main has started.");
           
           MyThread3 thread1=new MyThread3();
           thread1.start();
           
           System.out.println("main has ended.");
    }
 
}