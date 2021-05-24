package com.corejava.OOPs.MethodOverriding;

/* If superclass method throws/declare unchecked/RuntimeException - 
 * overridden method of subclass can declare/throw any unchecked /RuntimeException
 * 
 * RuntimeException is superclass of NullPointerException.
 * 
 */
class SuperClass5
{
    void method() throws NullPointerException
    {
           System.out.println("superClass method");
    }
}
 
class SubClass5 extends SuperClass5
{
    void method() throws RuntimeException  //Exception -> it will give CTE
    {
           System.out.println("SubClass method");
    }
}
 
 
/*
 * Main class */
public class ExceptionTest5 {
    public static void main(String[] args) {
           SuperClass5 obj=new SubClass5();
           obj.method();
    }
}
 