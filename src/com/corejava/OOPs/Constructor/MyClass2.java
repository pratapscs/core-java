package com.corejava.OOPs.Constructor;

class SuperClass1
{
    SuperClass1(int i){ //Argument constructor
      
    } 
//Because of argument constructor, compiler won’t provide no-arg constructor.
    SuperClass1() //2.no-arg constructor explicitly in SuperClass
    {
    	
    }
}

class SubClass1 extends SuperClass1
{
   // SubClass1() -> it will give CTE
	SubClass1()
    {
      super(1); //1.super(argument)-subclass calling argument constructor of superClass
    
    }
    
}
public class MyClass2
{
	public static void main(String[] args) 
	{  
	//	MyClass2 obj=new MyClass2();
	
	}

}
