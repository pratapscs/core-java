package com.corejava.OOPs.AbstractClass;

/*
 * abstract class
 */
abstract class MyAbstractClass1
{    
    void m(){  // abstract class with no abstract methods
           System.out.println("MyAbstractClass1 -  m()");
    }
    
}
/*
 * concrete class
 */ 
class MyClass2 extends MyAbstractClass1 {
    
    public static void main(String[] args) 
    {
           MyAbstractClass1 obj=new MyClass2();
           obj.m();
    }
}
 