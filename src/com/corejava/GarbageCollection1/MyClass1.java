package com.corejava.GarbageCollection1;

public class MyClass1 {

	@Override
    protected void finalize() throws Throwable 
    {
           try {
                  System.out.println("in finalize() method of SuperClass, "
                               + "doing cleanup activity SuperClass");
           } catch (Throwable throwable) {
                  throw throwable;
           }
    }
}
