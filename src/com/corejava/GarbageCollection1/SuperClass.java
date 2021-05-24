package com.corejava.GarbageCollection1;

//finalize method for object can be called from some other class outside the
//package with inheritance

public class SuperClass
{
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
