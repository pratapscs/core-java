package com.corejava.OOPs.Interfaces;

interface MyInterface 
{
    int i=2;
    void m1();
    void m2();
}
 

public class MyClass1 implements MyInterface
{ 
    public static void main(String[] args) 
    {
           MyInterface obj=new MyClass1();
           obj.m1();
           obj.m2();
           System.out.println("MyInterface's i = "+i);
    }
    
    @Override
    public void m1()
    {
           System.out.println("in m1()");
    }

    @Override
    public void m2()
    {
           System.out.println("in m2()");
    }
}