package com.corejava.OOPs.statickeyword;

class SuperClass
{
    static void method()
    {
           System.out.println("superClass method");
    }
}
 
class SubClass extends SuperClass{
    static void method(){
           System.out.println("SubClass method");
    }
}
 
 
public class StaticMethodTest1 
{
    
    @SuppressWarnings("static-access")
	public static void main(String[] args) 
    {
           SuperClass obj=new SubClass();
           obj.method();
    }
 
           
}