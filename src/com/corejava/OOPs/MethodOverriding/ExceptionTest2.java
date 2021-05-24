package com.corejava.OOPs.MethodOverriding;

/* If superclass method does not throw/declare any exception - 
 * overridden method of subclass cannot declare/throw any checked exception
 * 
 */
class SuperClass2
{
    void method() //throws Exception -> it will compile
    {
    	
           System.out.println("superClass method");
    }
}
 
class SubClass2 extends SuperClass2
{
    void method() // throws Exception -> it  will give CTE
    {
           System.out.println("SubClass method");
    }
}
 
 
/**
 * Main class */
public class ExceptionTest2
{
    public static void main(String[] args) throws Exception 
    {
           SuperClass2 obj=new SubClass2();
           obj.method();
    }
}