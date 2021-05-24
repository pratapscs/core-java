package com.corejava.OOPs.Interfaces;

//Multiple inheritance using interface

interface MyInterface1 
{
    void m();
}
 
interface MyInterface2 
{
    void n();
}

/**
 * Class implements two interfaces and provides implementation to the
 * methods of both interface.
 */
public class MyClass2 implements MyInterface1, MyInterface2
{
    public static void main(String[] args)
    {
           MyClass2 obj=new MyClass2();
           obj.m();
           obj.n();          
    }
 
    @Override
    public void m(){
           System.out.println("in implementation of MyInterface1's m()");
    }
 
    @Override
    public void n(){
           System.out.println("in implementation of MyInterface2's n()");
    }
}