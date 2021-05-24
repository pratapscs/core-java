package com.corejava.OOPs.MethodOverriding;

/* If superclass method does not throw/declare any exception - 
 * overridden method of subclass can declare/throw any unchecked /RuntimeException 
 * (superclass or subclass)
 */
class SuperClass1
{
    void method() throws Exception
    {
           System.out.println("superClass method");
    }
}
 
class SubClass1 extends SuperClass1
{
    void method() throws NullPointerException
    {
           System.out.println("SubClass method");
    }
}
 
 
/**
 * Main class */
public class ExceptionTest1 
{
    public static void main(String[] args) throws Exception {
           SuperClass1 obj=new SubClass1();
           obj.method();
    }
}