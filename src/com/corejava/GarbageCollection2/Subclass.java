package com.corejava.GarbageCollection2;

import com.corejava.GarbageCollection1.SuperClass;


public class Subclass extends SuperClass
{
    @Override
    protected void finalize() throws Throwable
    {
           try {
                  System.out.println("in finalize() method of Subclass, "
                               + "doing cleanup activity of Subclass");
           } 
           catch (Throwable throwable) 
           {
                  throw throwable;
           }finally{
                  super.finalize();
           }
    }
 
    public static void main(String[] args)
    {
           Subclass subclass = new Subclass();
           System.out.println("in main() method");
           try {
                  subclass.finalize(); //call finalize() method explicitly
           } catch (Throwable throwable) {
                  throwable.printStackTrace();
           }
           
    }
 
}