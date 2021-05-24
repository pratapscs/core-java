package com.corejava.OOPs.Interfaces;

interface MyInterface5 
{
    void m1();
    void m2();
}
/*
 * abstract class
 */
abstract class MyAbstractClass implements MyInterface5
{
    @Override
    public void m1()
    { 
           System.out.println("in m1()");
    }
}
/*
 * concrete class
 */
class MyClass5 extends MyAbstractClass 
{
    @Override
    public void m2()
    {
           System.out.println("in m2()");
    }
}