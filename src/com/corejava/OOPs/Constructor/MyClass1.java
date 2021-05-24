package com.corejava.OOPs.Constructor;

class SuperClass
{
    SuperClass()
    {
           super(); //will call constructor of java.lang.Object (bcz all classes extend Object)
           System.out.println("constructor of SuperClass");
    }
}
 
class SubClass extends SuperClass
{
    SubClass(){
           super();  //will call constructor of SuperClass
           System.out.println("constructor of SubClass");
    }
    
}
 
public class MyClass1
{
    public static void main(String[] args)
    {
           new SubClass(); //will call constructor of SubClass
    }
}
 