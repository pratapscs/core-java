package com.corejava.Basics.Blocks;

/**
 * SuperClass
 */
class SuperClass {
    
    /* Static block */
    static {
           System.out.println("SuperClass ----------> static block");
    }
 
 
    /* Non-Static block (Instance block) */
    {
           System.out.println("SuperClass ----------> Instance/non-static block");
    }
 
    /* Constructor*/
    SuperClass() {
           System.out.println("SuperClass ----------> constructor");
    }
 
}
 
 
/**
 * SubClass
 */
class SubClass extends SuperClass {
    
    /* Static block */
    static {
           System.out.println("SubClass > static block");
    }
 
 
    /* Non-Static block (Instance block) */
    {
           System.out.println("SubClass > Instance/non-static block");
    }
 
    /* Constructor*/
    SubClass() {
           System.out.println("SubClass > constructor");
    }
 
}
 
public class BlockTest1 
{
    public static void main(String[] args) 
    {
           
           //Create instance of SubClass.
           new SubClass();
           
    }
           
}
 