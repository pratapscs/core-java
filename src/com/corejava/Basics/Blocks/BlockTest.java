package com.corejava.Basics.Blocks;

class MyClass 
{
    
    /* Static block */
    static {
           System.out.println("static block");
    }
 
 
    /* Non-Static block (Instance block) */
    {
           System.out.println("instance/non-static block");
    }
 
    /* Constructor */
    MyClass()
    {
           System.out.println("MyClass constructor");
    }
 
}
 

public class BlockTest 
{
    public static void main(String[] args)
    {
           
           //Create instance of MyClass.
           new MyClass();
           
    }
           
}
 