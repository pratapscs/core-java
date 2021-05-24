package com.corejava.OOPs.Interfaces;

/*
 * Example why interface allow multiple inheritance
 * 
 * two interfaces  MyInterface1  and MyInterface2 having method with same name 
 * [ m() ] and some other class extends both of them, then no ambiguity will be 
 * caused, because m() is abstract method in both interfaces and their 
 * implementation will be provided by implementing class
 */

interface MyInterface3
{
    void m();
}
 
interface MyInterface4
{
    void m();
}
 
 
public class MyClass3 implements MyInterface3, MyInterface4
{
    public static void main(String[] args)
    {
           MyClass3 obj=new MyClass3();
           obj.m();   
       //   obj.m();
       //   obj.m();
    }
 
    @Override
    public void m()
    {
           System.out.println("in m()");
    }
 
}