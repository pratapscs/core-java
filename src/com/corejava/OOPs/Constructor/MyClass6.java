package com.corejava.OOPs.Constructor;

abstract class MyClass6
{
	MyClass6()
	{
           System.out.println("AbsClass constructor");
    }
}
 
 class SubClassh extends MyClass6
{
    SubClassh(){
           System.out.println("constructor");
    }
    
    @SuppressWarnings("unused")
	public static void main(String[] args) 
    {
           MyClass6 obj1=new SubClassh();
       //    AbsClass obj=new AbsClass(); //compilation error
    }
}