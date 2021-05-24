package com.corejava.OOPs.AbstractClass;

/*
 * abstract class
 */
abstract class MyAbstractClass
{
    abstract void m();   
}
 
/*
 * concrete class
 */
class MyClass1 extends MyAbstractClass 
{
    @Override
    public void m(){
           System.out.println("MyClass - m()");
    }
    
    public static void main(String[] args)
    {
    	MyAbstractClass obj=new MyClass1();
           obj.m();
    }
}
