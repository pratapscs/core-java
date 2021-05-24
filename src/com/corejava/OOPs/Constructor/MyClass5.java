package com.corejava.OOPs.Constructor;

public class MyClass5
{
    MyClass5(){ //constructor
           System.out.println("constructor");
    }
 
    MyClass5(Integer i){ //overloaded constructor
           System.out.println("overloaded constructor");
    }
    
    @SuppressWarnings("unused")
	public static void main(String[] args) 
    {
           MyClass5 obj1=new MyClass5();
           MyClass5 obj2=new MyClass5(1);
    }
}