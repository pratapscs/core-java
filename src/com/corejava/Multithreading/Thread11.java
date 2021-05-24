package com.corejava.Multithreading;

/* 
 * 
 */

public class Thread11
{
static  volatile int x = 0, y = 0;
    
    static void method1() //method1() which will be called repeatedly called by thread1 
    {
           x++; y++;
    }
    static void method2() //method2() which will be called repeatedly called by thread2.
    {
           System.out.println("x=" + x + " y=" + y);
    }
    
    public static void main(String[] args) 
    {
           Thread thread1=new Thread()
           {
                  public void run()
                  {
                        for(int i=0; i<10;i++)
                               method1();
                        
                  }
           };
 
           Thread thread2=new Thread()
           {
                  public void run()
                  {
                        for(int i=0; i<10;i++)
                               method2();
                        
                  }
           };
           
           thread1.start();
           thread2.start();
    }

}
